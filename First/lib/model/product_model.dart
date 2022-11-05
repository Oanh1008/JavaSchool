import 'package:first/model/rating_model.dart';

class ProductModel {
  int? id;
  String? title;
  num? price;
  String? description;
  String? category;
  String? image;
  Rating? rating;

  ProductModel({this.id, this.title, this.price, this.description, this.category, this.image, this.rating});

  factory ProductModel.fromJson(Map<String,dynamic> json){
    var p = ProductModel(
      id: json['id'],
      title: json['title'],
      description: json['description'],
      category: json['category'],
      price: json['price'],
      image: json['image'],
      rating: json['rating'] = Rating.fromJson(json['rating'])
    );

    return p;
  }
}