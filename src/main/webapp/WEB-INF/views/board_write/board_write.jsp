<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <%--SimpleMDE - Markdown Editor--%>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/simplemde/latest/simplemde.min.css">
    <script src="https://cdn.jsdelivr.net/simplemde/latest/simplemde.min.js"></script>

    <link rel="stylesheet" href="/resources/css/board_write.css">
    <title>몰입 경험 공유하기</title>
</head>

<body>
<div class="container">
    <jsp:include page="../include/nav.jsp"></jsp:include>
    <main class="main box">
        <div class="main container">
            <header>
                <jsp:include page="../include/header.jsp"></jsp:include>
            </header>
            <div class="writing box">
                <form action="/board-write" class="writing form" method="post">
                    <input type="hidden" name="userid" value="${principal.id}">
                        <input type="text" class="writing title header item" name= "title" placeholder="제목">

                    <select id="type" name="type">
                        <option value="2">일반게시판</option>
                        <option value="3">14기 게시판</option>
                    </select>

                    <p class="writing header item anonymous">익명</p>
                        <label class="switch writing header item anonymous" for="anonymous">
                           <input type="checkbox" id="anonymous" name="anonymous" >
                            <span class="slider round"></span>
                        </label>
<%--                    <form class="writing form item" method="post">--%>
                        <textarea id="summernote" name="description"></textarea>
                        <script>
                            // Most options demonstrate the non-default behavior
                            var simplemde = new SimpleMDE({
                                autofocus: true,
                                blockStyles: {
                                    bold: "__",
                                    italic: "_"
                                },
                                element: document.getElementById("summernote"),
                                forceSync: true,
                                // hideIcons: ["guide", "heading"],
                                indentWithTabs: false,
                                // initialValue: "Hello world!",
                                insertTexts: {
                                    horizontalRule: ["", "\n\n-----\n\n"],
                                    image: ["![](http://", ")"],
                                    link: ["[", "](http://)"],
                                    table: ["", "\n\n| Column 1 | Column 2 | Column 3 |\n| -------- | -------- | -------- |\n| Text     | Text      | Text     |\n\n"],
                                },
                                lineWrapping: false,
                                parsingConfig: {
                                    allowAtxHeaderWithoutSpace: true,
                                    strikethrough: false,
                                    underscoresBreakWords: true,
                                },
                                placeholder: "몰입의 경험을 공유하세요",
                                previewRender: function(plainText) {
                                    return customMarkdownParser(plainText); // Returns HTML from a custom parser
                                },
                                previewRender: function(plainText, preview) { // Async method
                                    setTimeout(function(){
                                        preview.innerHTML = customMarkdownParser(plainText);
                                    }, 250);

                                    return "Loading...";
                                },
                                promptURLs: true,
                                renderingConfig: {
                                    singleLineBreaks: false,
                                    codeSyntaxHighlighting: true,
                                },
                                shortcuts: {
                                    drawTable: "Cmd-Alt-T"
                                },
                                showIcons: ["code", "table"],
                                spellChecker: false,
                                status: false,
                                status: ["lines", "words", "cursor"], // Optional usage
                                status: ["lines", "words", "cursor", {
                                    className: "keystrokes",
                                    defaultValue: function(el) {
                                        this.keystrokes = 0;
                                        el.innerHTML = "0 Keystrokes";
                                    },
                                    onUpdate: function(el) {
                                        el.innerHTML = ++this.keystrokes + " Keystrokes";
                                    }
                                }], // Another optional usage, with a custom status bar item that counts keystrokes
                                styleSelectedText: false,
                                tabSize: 4
                            });
                        </script>
<%--                    </form>--%>
                    <button type="submit" class="writing item button post">POST</button>
                </form>
            </div>
        </div>
    </main>
</div>

</body>

</html>