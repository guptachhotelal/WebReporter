$(function () {
//    $(".doctor1").click(function () {
//        $.ajax({
//            type: 'GET',
//            url: "doctorForm.htm",
//            data: "id=0",
//            success: function (response) {
//                 $("#contents").html(response);
//            }
//        });
//    });
    $(".doctor2").click(function () {
        $("#contents").html("viewdoctor");
    });
});

$(function () {
    $("#userName").focus();
});