// 로그인
<<<<<<< HEAD:admin.js
$("#login-form").submit(function (e) {
  $.ajax({
    type: "post",
    url: "url",
    data: "data",
    dataType: "dataType",
    success: function (response) {},
  });
});

// 영상 업로드
$("#ubload").submit(function (e) {
  $.ajax({
    type: "method",
    url: "url",
    data: "data",
    dataType: "dataType",
    success: function (response) {},
  });
});
=======
$('#login-form').submit(function (e) {
    $.ajax({
        type: "post",
        url: "url",
        data: "data",
        dataType: "dataType",
        success: function (response) {

        }
    });
});

// 영상 업로드
$('#ubload').submit(function (e) {
    $.ajax({
        type: "method",
        url: "url",
        data: "data",
        dataType: "dataType",
        success: function (response) {

        }
    });

});
>>>>>>> d1482c9815ef71f58592bf637edecbf6794f1856:src/main/resources/static/script/admin.js
