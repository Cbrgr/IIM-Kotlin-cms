<#-- @ftlvariable name="list" type="burger.constantin.cms.tpl.IndexContext" -->
<html>
<head>
    <link rel="stylesheet" href="../kotlin/ressources/css/style.css">
</head>
<body>
    <div class="inner">
    <#list list as l>
        <a href="/article/${l.id}"><h1>${l.title}</h1></a>
        <p>${l.text}</p>
    </#list>
    </div>
</body>
</html>