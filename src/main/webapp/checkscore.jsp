<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>河南联通IT人才综合评测指标</title>
    <link rel="stylesheet" type="text/css" href="css/checkscore.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <script type="application/javascript" src="js/jquery-3.3.1.js"></script>
</head>

<body>

    <div class="jumbotron">
        <h1>河南联通IT人才综合评测指标</h1>
    </div>
   <div class="main">
    <div class="all">
        <div class="row" >
            <div class="col-xs-6 col-md-3">
                专业线
                <select name="zhibiao" id ="select1">
                    <option value="1" selected>----</option>
                    <option>市场部</option>
                    <option>信息化</option>
                </select>
            </div>
            <div class="col-xs-6 col-md-3">
                指标
                <select name="zhibiao" id ="select2">
                    <option value="1" selected>----</option>
                    <option>职称/职建</option>
                    <option>学历/学位</option>
                </select>
            </div>
            <div class="col-xs-6 col-md-3">
                权重
                <input type="text" name="rare" id="rare" value="" />
            </div>
            <div class="score" id="score" >
                评分标准
                <input type="text" name="score" id="score1" value="" />
            </div>
        </div>
    </div>

    <div id="fuben"></div>



    <div class="buttons">
        <div class="btn btn-default" >
            <input type="button" value="添加" id="add"/>
            <input type="button" value="删除" id="delete1"/>
            <input type="button" value="展示" id=""/>
        </div>
    </div>
</div>



<script type="text/javascript">
    //
    // f{
    //     var div=document.getElementById("all");
    //     var div2=div.cloneNode(true);
    //     document.body.appendChild(div2);
    // }
    //
    //
    // document.getElementById("delete1").onclick=function(){
    //     $("row").remove();
    // }

    document.getElementById("add").onclick=function AddElement(mytype){
        var mytype,TemO=document.getElementById("select1");
        var newInput = document.createElement("input");
        newInput.type=mytype;
        newInput.name="input1";
        TemO.appendChild(newInput);
        var newline= document.createElement("br");//创建一个BR标签是为能够换行！
        TemO.appendChild(newline);
    }

    </script>
</body>

</html>

