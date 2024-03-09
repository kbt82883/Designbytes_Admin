// 로그인
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