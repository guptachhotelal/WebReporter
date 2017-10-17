$(function () {
    $("#userName").focus();
});







$(function () {
    $(".startDate").datepicker({
        dateFormat: 'dd/mm/yy'
    }).datepicker("setDate", new Date());
    $(".endDate").datepicker({
        dateFormat: 'dd/mm/yy'
    }).datepicker("setDate", new Date());
});


$(function () {
    $(".dialog").click(function () {
        $("#activityDialog").dialog({
            autoOpen: false,
            width: 400,
            buttons: {
                "Ok": function () {
                    $(this).dialog("close");
                },
                Cancel: function () {
                    $(this).dialog("close");
                }
            }
        });
        $("#activityDialog").dialog('open');
        return false;
    });
});