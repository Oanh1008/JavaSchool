// import 'package:first/provider/product_provider.dart';
// import 'package:flutter/material.dart';
// import 'package:provider/provider.dart';
//
// class ProduceListPage extends StatelessWidget {
//   const ProduceListPage({Key? key}) : super(key: key);
//
//   @override
//   Widget build(BuildContext context) {
//     var provider = Provider.of<ProductProvider>(context);
//     provider.getProducts();
//     return Scaffold(
//       body: GridView.count(
//         primary: false,
//         padding: const EdgeInsets.all(20),
//         crossAxisSpacing: 20,
//         mainAxisSpacing: 20,
//         crossAxisCount: 2,
//         children: [
//           ...provider.list.map((e) {
//             return Container(
//
//               padding: const EdgeInsets.all(8),
//               color: Colors.teal[100],
//               child: Column(
//                 children: [
//                   Text(e.title??""),
//                   Text("Price: "+e.price.toString()),
//                   Text("Description: "+e.description.toString()??"")
//                 ],
//               )
//             );
//           })
//         ],
//       ),
//     );
//   }
// }
