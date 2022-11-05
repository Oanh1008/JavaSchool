class LopHocPhanModel {
  String? hinhnen;
  String? mahocphan;
  String? tenhocphan;
  int? soluongsinhvien;

  LopHocPhanModel(
      {this.hinhnen, this.mahocphan, this.tenhocphan, this.soluongsinhvien});
}

List<LopHocPhanModel> ls = [
  LopHocPhanModel(
      hinhnen: "assets/images/anh12.jpg",
      mahocphan: "TIN1011",
      tenhocphan: "Tin học đại cương",
      soluongsinhvien: 77),
  LopHocPhanModel(
      hinhnen: "assets/images/anh12.jpg",
      mahocphan: "TIN1012",
      tenhocphan: "Lập trình nâng cao",
      soluongsinhvien: 73),
  LopHocPhanModel(
      hinhnen: "assets/images/anh12.jpg",
      mahocphan: "TIN1013",
      tenhocphan: "Flutter cơ bản",
      soluongsinhvien: 77),
  LopHocPhanModel(
      hinhnen: "assets/images/anh12.jpg",
      mahocphan: "TIN1014",
      tenhocphan: "Java cơ bản",
      soluongsinhvien: 33),
  LopHocPhanModel(
      hinhnen: "assets/images/download.png",
      mahocphan: "TIN1015",
      tenhocphan: "Toán rời rạc",
      soluongsinhvien: 29),
];
