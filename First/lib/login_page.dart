import 'package:flutter/material.dart';

class LoginPage extends StatelessWidget {
  LoginPage({Key? key}) : super(key: key);
  var userNameController = TextEditingController();
  var userPasswordController = TextEditingController();

  var formKey = GlobalKey<FormState>();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child: Form(
          key: formKey,
          child: Column(
            children: [
              Text(
                "Login form",
                style: TextStyle(fontSize: 25),
              ),
              Container(
                height: 300,
                decoration: BoxDecoration(
                    image: DecorationImage(
                        image: AssetImage("assets/images/anh12.jpg"),
                        fit: BoxFit.cover)),
              ),
              TextFormField(
                  validator: (value) {
                    if (value == null || value.isEmpty) {
                      return "Login name is not empty";
                    }
                    return null;
                  },
                  controller: userNameController,
                  decoration: InputDecoration(
                    border: UnderlineInputBorder(),
                      hintText: "Enter your account",
                      label: Text("login name"),
                      prefixIcon: Icon(Icons.person))),
              TextFormField(

                obscureText: true,
                  validator: (value) {
                    if (value == null || value.isEmpty) {
                      return "Password is not empty";
                    }
                    return null;
                  },
                  controller: userPasswordController,
                  decoration: InputDecoration(
                    border: OutlineInputBorder(),
                      hintText: "Enter your password",
                      label: Text("login password"),
                      prefixIcon: Icon(Icons.password))),
              ElevatedButton(
                  onPressed: () {
                    if (formKey.currentState!.validate()) {
                      var userName = userNameController.text;
                      var snackBar =
                          SnackBar(content: Text("Hello : ${userName}"));
                      ScaffoldMessenger.of(context).showSnackBar(snackBar);
                    }
                  },
                  child: Text("Login"))
            ],
          ),
        ),
      ),
    );
  }
}
