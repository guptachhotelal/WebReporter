setInterval(function () {showTime();}, 1000);
function showTime() {
    $.ajax({
        url: "timer.htm",
        type: "POST",
        success: function (response) {
            $("#timer").html(response);
        }
    });
}