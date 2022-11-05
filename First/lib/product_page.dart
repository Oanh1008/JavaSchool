// ignore_for_file: non_constant_identifier_names


import 'package:first/ListTile.dart';
import 'package:first/model/product_model.dart';
import 'package:first/product_details_page.dart';
import 'package:first/provider/product_provider.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

class HomeScreen extends StatefulWidget {
  HomeScreen({Key? key}) : super(key: key);

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  int _value = 0;

  List<String> categoriesName = ProductProvider.getAll();
  @override
  Widget build(BuildContext context) {
   return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(
        backgroundColor: Colors.transparent,
        elevation: 0,
        title: const Text(
          "Shop's Pham Van Oanh 9.5đ",
          style: TextStyle(color: Colors.black, fontWeight: FontWeight.w600),
        ),
      ),
      body: Column(
        children: [
          const SizedBox(
            height: 5,
          ),
          Container(
            width: MediaQuery.of(context).size.width,
            height: 140,
            decoration: const BoxDecoration(
                image: DecorationImage(
                    image: AssetImage('assets/svgviewer-png-output.png'),
                    fit: BoxFit.contain)),
          ),
          const SizedBox(
            height: 20,
          ),
          Container(
            padding: const EdgeInsets.only(left: 15),
            width: MediaQuery.of(context).size.width,
            child: SingleChildScrollView(
              physics: const BouncingScrollPhysics(),
              scrollDirection: Axis.horizontal,
              child: Row(
                children: List.generate(categoriesName.length, (index) {
                  return MyRadioListTile<int>(
                    value: index,
                    groupValue: _value,
                    leading: categoriesName[index],
                    onChanged: (value) {
                      setState(() {
                        _value = value!;
                      });
                    },
                  );
                }),
              ),
            ),
          ),
          const SizedBox(
            height: 20,
          ),
          FutureBuilder<List<ProductModel>>(
            future: _value == 0
                ? ProductProvider.getProducts()
                : ProductProvider.getProductsByCategory(categoriesName[_value].toString()),
            builder: (context, snapshot) {
              return snapshot.hasData
                  ? Expanded(
                child: Padding(
                  padding: const EdgeInsets.symmetric(horizontal: 20.0),
                  child: GridView.builder(
                      physics: const BouncingScrollPhysics(),
                      shrinkWrap: true,
                      itemCount: snapshot.data!.length,
                      gridDelegate:
                      const SliverGridDelegateWithFixedCrossAxisCount(
                          crossAxisSpacing: 20,
                          mainAxisSpacing: 20,
                          crossAxisCount: 2),
                      itemBuilder: (BuildContext context, int index) {
                        return InkWell(
                          onTap: (() {
                            Navigator.of(context).push(MaterialPageRoute(
                                builder: (context) => ArticlScreen(
                                  articalID:
                                  snapshot.data![index].id!,
                                )));
                          }),
                          child: Column(
                            crossAxisAlignment: CrossAxisAlignment.start,
                            children: [
                              Expanded(
                                child: Container(
                                  decoration: BoxDecoration(
                                      image: DecorationImage(
                                          image: NetworkImage(snapshot
                                              .data![index].image!),
                                          fit: BoxFit.contain)),
                                ),
                              ),
                              const SizedBox(
                                height: 10,
                              ),
                              Text(
                                snapshot.data![index].title!,
                                overflow: TextOverflow.ellipsis,
                                maxLines: 2,
                                style: const TextStyle(
                                    color: Colors.black,
                                    fontWeight: FontWeight.w600),
                              ),
                              const SizedBox(
                                height: 10,
                              ),
                              Text(
                                '\$' +
                                    snapshot.data![index].price
                                        .toString(),
                                overflow: TextOverflow.ellipsis,
                                maxLines: 1,
                                style: const TextStyle(
                                    color: Color.fromARGB(
                                        255, 253, 104, 104),
                                    fontWeight: FontWeight.w600),
                              ),
                            ],
                          ),
                        );
                      }),
                ),
              )
                  : const Expanded(
                  child: Center(
                    child: CircularProgressIndicator(),
                  ));
            },
          ),
        ],
      ),
    );
  }
}

