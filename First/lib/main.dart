import 'package:first/product_page.dart';
import 'package:first/productlist_page.dart';
import 'package:first/provider/product_provider.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

// Ham chinh chay giao dien dau tien
void main() {
  runApp(MultiProvider(
    providers: [
      ChangeNotifierProvider(create: (_) => ProductProvider())
    ],
    child: MaterialApp(
      home: HomeScreen(),
    ),
  ));
}
