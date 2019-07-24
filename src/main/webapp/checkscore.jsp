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
    <script type="application/javascript" src="js/checkscore.js"></script>
</head>

<body>

<div class="main">
    <div class="jumbotron">
        <h1>河南联通IT人才综合评测指标</h1>
    </div>
    <div class="container" id="clone">
        <div class="row">
            <div class="col-md-3">
               <p>指标
                   <select name="targetSelect" id="target0" index="0" onchange=myselect() >
                       <option value ="0" name="">职称/职鉴</option>
                       <option value ="1" name="">学历/学位</option>
                       <option value="2"name="">年度考核</option>
                       <option value="3"name="">荣誉奖章</option>
                       <option value="4"name="">技能竞赛</option>
                       <option value="5"name="">科技进步、创新奖</option>
                       <option value="6"name="">专利</option>
                       <option value="7"name="">论文著作</option>
                       <option value="8"name="">专业认证或资质</option>
                       <option value="9"name="">项目成果</option>
                       <option  value="10" selected>--------</option>
                   </select>
               </p>
            </div>

            <div class="col-md-3" id="weight0">
                <p>权重
                    <input type="text" name="weight" id="weightInput0" />
                </p>
            </div>
            <div class="col-md-3">
                <p>类型

                    <select name="typeSelect" id ="sel00" style="display: none">
                        <option value="1" selected>高级</option>
                        <option value="2"d>初级</option>
                        <option value="3">中级</option>
                    </select>
                    <select name="typeSelect" id ="sel01" style="display: none">
                        <option value="1" selected>博士</option>
                        <option value="2">硕士</option>
                        <option value="3">本科</option>
                    </select>
                    <select name="typeSelect" id ="sel02" style="display: none">
                        <option value="1" selected>0优</option>
                        <option value="2">1优</option>
                        <option value="3">2优</option>
                        <option value="4">3优</option>
                    </select>
                    <select name="typeSelect" id ="sel03" style="display: none">
                        <option value="1" selected>国家级</option>
                        <option value="2">省、部、集团级</option>
                        <option value="3">地、厅、省公司</option>
                    </select>
                    <select name="typeSelect" id ="sel04" style="display: none">
                        <option value="1" selected>国家级</option>
                        <option value="2">省、部、集团级</option>
                        <option value="3">地、厅、省公司</option>
                    </select>
                    <select name="typeSelect" id ="sel05" style="display: none">
                        <option value="1" selected>国家级</option>
                        <option value="2">省、部、集团级</option>
                        <option value="3">地、厅、省公司</option>
                    </select>
                    <select name="typeSelect" id ="sel06" style="display: none">
                        <option value="1" selected>国家发明专利</option>
                        <option value="2">实用新型专利</option>
                    </select>
                    <select name="typeSelect" id ="sel07" style="display: none">
                        <option value="1" selected>核心期刊及以上一作</option>
                        <option value="1" selected>核心期刊及以上二作</option>
                        <option value="2">CN期刊一作</option>
                        <option value="2">CN期刊二作</option>
                        <option value="3">著作主编</option>
                        <option value="3">著作副主编</option>
                    </select>
                    <select name="typeSelect" id ="sel08" style="display: none">
                        <option value="1" selected>国际高级</option>
                        <option value="2">国际初级</option>
                        <option value="3">国际中级</option>
                        <option value="1" selected>国内高级</option>
                        <option value="2">国内初级</option>
                        <option value="3">国内中级</option>
                    </select>
                    <select name="typeSelect" id ="sel09" style="display: none">
                        <option value="1" selected>集团公司重点项目</option>
                        <option value="2">省公司重点项目</option>
                        <option value="3">大数据基地全国推广项目</option>
                    </select>
                </p>
            </div>
            <div class="col-md-3">
                <p>对应分值
                    <input type="text" name="score" id="score0"/>
                </p>
            </div>
        </div>
    </div>
    <div id="cloneadd">

    </div>
    <div class="container" id="buttons">
        <input type="button"  value="添加+" id="add" />
        <input type="button"  value="重置" id="delete" />
        <input type="button"  value="提交" id="sure" />
    </div>
</div>
<script type="application/javascript">
    var oId = 1;
    $('#add').click(function(){
        // 拼写id
        var id = '#clone'+oId;
        $('#clone').clone(true).attr('id','clone'+oId).appendTo('#cloneadd').show();

        //
        $(id).find('select[name="targetSelect"]').attr('id','target'+oId).val('10')
        $(id).find('select[name="targetSelect"]').attr('index',oId)
        $(id).find('select[name="typeSelect"]').hide()
        $(id).find('[name="weight"]').attr('id','weight'+oId).val('')
        $(id).find('[name="score"]').attr('id','score'+oId).val('')
        var typeSelects = $(id).find('select[name="typeSelect"]');
        for(var i=0; i<typeSelects.length; i++) {
            typeSelects.eq(i).attr('id','sel'+oId+i)
        }
        $('#target').attr('id','target'+oId);
        $('#weight').attr('id','weight'+oId);
        oId += 1;
    });
    $('#sure').click(
        function () {
            var numArr=$("input[name='checkweight']");
            var sum=0;
            for(var i=0;i<numArr.length;i++)
            {
                sum+=Number(numArr.eq(i).val());
            }
            if(sum!=100){
                alert("请核查权重分配，其和必须为100！");
            }
        }
    );

</script>
</body>

</html>

