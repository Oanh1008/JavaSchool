import 'dart:core';
import 'package:first/meterial.dart';
import 'package:first/model/lophocphan_model.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class CodeLap extends StatelessWidget {
  CodeLap({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Icon(Icons.add),
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            ...ls.map((e) {
              return Container(
                padding:
                    EdgeInsets.only(left: 10, right: 10, top: 5, bottom: 5),
                margin: EdgeInsets.all(10),
                decoration: BoxDecoration(
                    borderRadius: BorderRadius.circular(20),
                    image: DecorationImage(
                        image: AssetImage(e.hinhnen ?? ""), fit: BoxFit.cover)),
                height: 200,
                width: MediaQuery.of(context).size.width,
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Row(
                      children: [
                        Text(
                          e.tenhocphan ?? "",
                          style: TextStyle(fontSize: 25),
                        ),
                        Text(
                            "...",
                            )
                      ],
                    ),
                    Text(e.mahocphan ?? "", style: TextStyle(fontSize: 25)),
                    SizedBox(
                      height: 20,
                    ),
                    Text("${e.soluongsinhvien ?? 0} học viên",
                        style: TextStyle(fontSize: 25))
                  ],
                ),
              );
            }).toList()
          ],
        ),
      ),
    );
  }
}
