<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
    <div>
        <@l.logout />
        <span><a href="/user">User List</a></span>
    </div>
    <div>
        <form method="post" enctype="multipart/form-data">
            <input type="text" name="ticker" placeholder="Введите тикер">
            <input type="text" name="value" placeholder="Введите цену">
            <input type="file" name="file">
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <button type="submit">Добавить</button>
        </form>
    </div>
    <div>Список тикеров</div>
    <div>
        <form method="get" action="/main">
            <input type="text" name="filter" value="${filter!}">
            <button type="submit">Поиск</button>
        </form>
    </div>
    <#list companyInfos as companyInfo>
        <div>
            <b>${companyInfo.id}</b>
            <span>${companyInfo.ticker}</span>
            <i>${companyInfo.value}</i>
            <div>
                <#if companyInfo.filename??>
                    <img src="/img/${companyInfo.filename}">
                </#if>
            </div>
        </div>
    <#else>
        No Info
    </#list>
</@c.page>