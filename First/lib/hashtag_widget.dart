import 'dart:math';

import 'package:flutter/material.dart';

class HashTagWidget extends StatelessWidget {
  HashTagWidget({Key? key}) : super(key: key);

  List<String> hashList = [
    'Tất cả',
    'Du lịch',
    'Trò chơi',
    'Âm nhạc',
    'Giải trí'
  ];

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      scrollDirection: Axis.horizontal,
      child: Container(
        child: Row(
          children: [
            ...hashList.map((e) {
              return Container(
                  padding: EdgeInsets.all(20),
                  margin: EdgeInsets.all(10),
                  decoration: BoxDecoration(
                    color: Color(Random().nextInt(0xffffffff)),
                    borderRadius: BorderRadius.circular(30),
                  ),
                  child: Text(
                    e,
                    style: TextStyle(fontSize: 14, color: Colors.black),
                  ));
            }).toList()
          ],
        ),
      ),
    );
  }
}
// Stack, Align