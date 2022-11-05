import 'dart:convert';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:first/model/product_model.dart';
import 'package:http/http.dart' as http;
import 'package:provider/provider.dart';

class ProductProvider extends ChangeNotifier{

  List<ProductModel> list = [];

  static Future<List<ProductModel>> getProducts() async{

    var url = "https://fakestoreapi.com/products";
    var client = http.Client();
    var rs = await client.get(Uri.parse(url));
    var jsonString = rs.body;

    var jsonObject = jsonDecode(jsonString) as List;

    return jsonObject.map((e){
      return ProductModel.fromJson(e);
    }).toList();

  }
  static Future<List<ProductModel>> getProductsByCategory(String name) async{
    var url = "https://fakestoreapi.com/products/category/$name";
    var client = http.Client();
    var rs = await client.get(Uri.parse(url));
    var jsonString = rs.body;

    var jsonObject = jsonDecode(jsonString) as List;

    return jsonObject.map((e) {
      return ProductModel.fromJson(e);
    }).toList();

  }
  static Future<ProductModel> fetchArticleByID(int aricle_ID) async {
    var url = "https://fakestoreapi.com/products/$aricle_ID";
    var client = http.Client();
    var rs = await client.get(Uri.parse(url));
    var jsonString = rs.body;

    var jsonObject = jsonDecode(jsonString);
    return ProductModel.fromJson(jsonObject);
  }

  static Future<List<String>> getAllCategory() async {
    var url = "https://fakestoreapi.com/products/categories";
    var client = http.Client();
    var rs = await client.get(Uri.parse(url));
    var jsonString = rs.body;

    var jsonObject= jsonDecode(jsonString) as List;
    return jsonObject.map((e) {
      return e.toString();
    }).toList();
  }

  static List<String> getAll() {
    List<String> _listCategory = [];
    _listCategory.add("All");
    getAllCategory().then((value) {
      if (value != null) value.forEach((item) => _listCategory.add(item));
    });
    return _listCategory == null ? [] : _listCategory;
  }
}