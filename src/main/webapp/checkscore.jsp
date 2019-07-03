<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>河南联通IT人才综合评测指标</title>
    <link rel="stylesheet" type="text/css" href="css/checkscore.css">
</head>

<body>
<h1 align="center">河南联通IT人才综合评测指标</h1>
<div class="all">
    <div id="clone111">
        <div class="select">
            指标
            <select name="user" id ="select">
                <option value="1" selected>----</option>
                <option>职称/职建</option>
            </select>
        </div>
        <div class="rare">
            权重
            <input type="text" name="rare" id="rare" value="" />
        </div>

        <div class="score" id="score" >
            评分标准
            <input type="text" name="score" id="rare" value="" />
        </div>
    </div>

    <div id="fuben"></div>
    <div class="buttons">
        <div class="add">
            <input type="button" value="添加" id="add"/>
        </div>
        <div class="delete">
            <input type="button" value="删除" id="delete"/>
        </div>
    </div>
</div>


<script type="application/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">
    // $(function () {
    //     alert("nijnadhsu");
    // });
    // $("add").click(function(){
    //     $('clone111').clone().prependTo("fuben");
    // });


    // document.getElementById("add").onclick=function(){
    // $('clone111').clone().prependTo("fuben");
    // }

    document.getElementById("add").onclick=function(){
        var div=document.getElementById("clone111");
        var div2=div.cloneNode(true);
        document.body.appendChild(div2);
    }


    document.getElementById("delete").onclick=function(){
        $("fuben").remove();
        //删除节点,参数为true时，连同子节点也一起上删除，此方法在IE中有效
        f(1);
        //文本框清空
        document.getElementById("rare").value="";
    }

    function f(id){
        m=$("select");
        for(i=0;i<=m.options.length;i++)
        {
            if(parseInt(m.options[i].value)==parseInt(id))
            {
                m.options[i].selected=true;
                break;
            }
        }
    }
    function $(id){
        return document.getElementById(id);
    }


</script>
</body>

</html>

