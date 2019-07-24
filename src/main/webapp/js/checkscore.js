function myselect() {
    var currentTarget = $(event.currentTarget);
    var index = currentTarget.attr('index');
    // var selectIndex = $(event.currentTarget).children().filter(':selected').val();
    var selectIndex = $(event.currentTarget).val();
    var showID = '#sel'+index+selectIndex;

    // 将所有类型的select框隐藏
    $(event.currentTarget).parent().parent().parent().find('select[name="typeSelect"]').hide();
    // 显示当前指标选项对应的select款
    $(showID).show()
        /*//selectedIndex == 0 表示选了：用户部门
        if ($('select[id^=target]').get(0).selectedIndex==0) {
            document.getElementById('sel00').style.display = "";
            document.getElementById('sel01').style.display = "none";
            document.getElementById('sel02').style.display = "none";
            document.getElementById('sel03').style.display = "none";
            document.getElementById('sel04').style.display = "none";
            document.getElementById('sel05').style.display = "none";
            document.getElementById('sel06').style.display = "none";
            document.getElementById('sel07').style.display = "none";
            document.getElementById('sel08').style.display = "none";
            document.getElementById('sel09').style.display = "none";
            return;
        }
    if ($('select[id^=target]').get(0).selectedIndex==1) {
        document.getElementById('sel00').style.display = "none";
        document.getElementById('sel01').style.display = "";
        document.getElementById('sel02').style.display = "none";
        document.getElementById('sel03').style.display = "none";
        document.getElementById('sel04').style.display = "none";
        document.getElementById('sel05').style.display = "none";
        document.getElementById('sel06').style.display = "none";
        document.getElementById('sel07').style.display = "none";
        document.getElementById('sel08').style.display = "none";
        document.getElementById('sel09').style.display = "none";
        return;
    }
    if ($('select[id^=target]').get(0).selectedIndex==2) {
        document.getElementById('sel00').style.display = "none";
        document.getElementById('sel01').style.display = "none";
        document.getElementById('sel02').style.display = "";
        document.getElementById('sel03').style.display = "none";
        document.getElementById('sel04').style.display = "none";
        document.getElementById('sel05').style.display = "none";
        document.getElementById('sel06').style.display = "none";
        document.getElementById('sel07').style.display = "none";
        document.getElementById('sel08').style.display = "none";
        document.getElementById('sel09').style.display = "none";
        return;
    }
    if ($('select[id^=target]').get(0).selectedIndex==3) {
        document.getElementById('sel00').style.display = "none";
        document.getElementById('sel01').style.display = "none";
        document.getElementById('sel02').style.display = "none";
        document.getElementById('sel03').style.display = "";
        document.getElementById('sel04').style.display = "none";
        document.getElementById('sel05').style.display = "none";
        document.getElementById('sel06').style.display = "none";
        document.getElementById('sel07').style.display = "none";
        document.getElementById('sel08').style.display = "none";
        document.getElementById('sel09').style.display = "none";
        return;
    }
    if ($('select[id^=target]').get(0).selectedIndex==4) {
        document.getElementById('sel00').style.display = "none";
        document.getElementById('sel01').style.display = "none";
        document.getElementById('sel02').style.display = "none";
        document.getElementById('sel03').style.display = "none";
        document.getElementById('sel04').style.display = "";
        document.getElementById('sel05').style.display = "none";
        document.getElementById('sel06').style.display = "none";
        document.getElementById('sel07').style.display = "none";
        document.getElementById('sel08').style.display = "none";
        document.getElementById('sel09').style.display = "none";
        return;
    }
    if ($('select[id^=target]').get(0).selectedIndex==5) {
        document.getElementById('sel00').style.display = "none";
        document.getElementById('sel01').style.display = "none";
        document.getElementById('sel02').style.display = "none";
        document.getElementById('sel03').style.display = "none";
        document.getElementById('sel04').style.display = "none";
        document.getElementById('sel05').style.display = "";
        document.getElementById('sel06').style.display = "none";
        document.getElementById('sel07').style.display = "none";
        document.getElementById('sel08').style.display = "none";
        document.getElementById('sel09').style.display = "none";
        return;
    }
    if ($('select[id^=target]').get(0).selectedIndex==6) {
        document.getElementById('sel00').style.display = "none";
        document.getElementById('sel01').style.display = "none";
        document.getElementById('sel02').style.display = "none";
        document.getElementById('sel03').style.display = "none";
        document.getElementById('sel04').style.display = "none";
        document.getElementById('sel05').style.display = "none";
        document.getElementById('sel06').style.display = "";
        document.getElementById('sel07').style.display = "none";
        document.getElementById('sel08').style.display = "none";
        document.getElementById('sel09').style.display = "none";
        return;
    }
    if ($('select[id^=target]').get(0).selectedIndex==7) {
        document.getElementById('sel00').style.display = "none";
        document.getElementById('sel01').style.display = "none";
        document.getElementById('sel02').style.display = "none";
        document.getElementById('sel03').style.display = "none";
        document.getElementById('sel04').style.display = "none";
        document.getElementById('sel05').style.display = "none";
        document.getElementById('sel06').style.display = "none";
        document.getElementById('sel07').style.display = "";
        document.getElementById('sel08').style.display = "none";
        document.getElementById('sel09').style.display = "none";
        return;
    }
    if ($('select[id^=target]').get(0).selectedIndex==8) {
        document.getElementById('sel00').style.display = "none";
        document.getElementById('sel01').style.display = "none";
        document.getElementById('sel02').style.display = "none";
        document.getElementById('sel03').style.display = "none";
        document.getElementById('sel04').style.display = "none";
        document.getElementById('sel05').style.display = "none";
        document.getElementById('sel06').style.display = "none";
        document.getElementById('sel07').style.display = "none";
        document.getElementById('sel08').style.display = "";
        document.getElementById('sel09').style.display = "none";
        return;
    }
    if ($('select[id^=target]').get(0).selectedIndex==9) {
        document.getElementById('sel00').style.display = "none";
        document.getElementById('sel01').style.display = "none";
        document.getElementById('sel02').style.display = "none";
        document.getElementById('sel03').style.display = "none";
        document.getElementById('sel04').style.display = "none";
        document.getElementById('sel05').style.display = "none";
        document.getElementById('sel06').style.display = "none";
        document.getElementById('sel07').style.display = "none";
        document.getElementById('sel08').style.display = "none";
        document.getElementById('sel09').style.display = "";
        return;
    }*/

}