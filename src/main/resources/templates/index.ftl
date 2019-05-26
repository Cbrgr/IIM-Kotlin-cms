<#-- @ftlvariable name="list" type="burger.constantin.cms.tpl.IndexContext" -->
<html>
<head>
    <#--    <link rel="stylesheet" href="../css/style.css">-->
    <style>
        h1, p, a {
            margin: 0;
            color: #444;
            text-decoration: none;
        }
        a {display: block;}

        .inner {
            padding-top: 40px;
            max-width: 900px;
            width: 100%;
            margin: 0 auto;
        }
        .articlelist__item {
            padding: 20px; margin-bottom: 20px;
            border: 1px solid #ccc; border-radius: 10px;
            transition: 0.3s;
        }
        .articlelist__item:hover {
            transform: translateX(10px);
        }
    </style>
</head>
<body>
<div class="inner">
    <#list list as l>
        <a class="articlelist__item" href="/article/${l.id}">
            <h1>${l.title}</h1>
            <p>${l.text}</p>
        </a>
    </#list>
</div>
</body>
</html>