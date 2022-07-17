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
                <form action="" class="writing form">
                    <input type="text" class="writing title item" placeholder="제목">
                    <form class="writing form item" method="post">
                        <textarea id="summernote" name="editordata" ></textarea>
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
<%--                        <script>--%>
<%--                            $(document).ready(function () {--%>
<%--                                $('#summernote').summernote({--%>
<%--                                    height: 300,                              // 에디터 높이--%>
<%--                                    minHeight: null,                          // 최소 높이--%>
<%--                                    maxHeight: null,                          // 최대 높이--%>
<%--                                    focus: true,                              // 에디터 로딩후 포커스를 맞출지 여부--%>
<%--                                    lang: "ko-KR",				              // 한글 설정--%>
<%--                                    placeholder: '몰입의 경험을 공유하세요',	//placeholder 설정--%>
<%--                                    tabsize: 2,--%>
<%--                                    toolbar: [--%>
<%--                                        // [groupName, [list of button]]--%>
<%--                                        ['style', ['style']],--%>
<%--                                        ['fontname', ['fontname']],--%>
<%--                                        ['fontsize', ['fontsize']],--%>
<%--                                        ['font', ['bold', 'underline', 'clear']],--%>
<%--                                        ['para', ['ul', 'ol', 'paragraph']],--%>
<%--                                        ['height', ['height']],--%>
<%--                                        ['table', ['table']],--%>
<%--                                        ['insert', ['picture', 'link', 'video']],--%>
<%--                                        ['view', ['codeview']]--%>
<%--                                    ],--%>
<%--                                    fontNames: ['Arial', 'Arial Black', 'Comic Sans MS', 'Courier New', '맑은 고딕', '궁서', '굴림체', '굴림', '돋움체', '바탕체'],--%>
<%--                                    fontSizes: ['8', '9', '10', '11', '12', '14', '16', '18', '20', '22', '24', '28', '30', '36', '50', '72']--%>
<%--                                });--%>
<%--                            });--%>
<%--                        </script>--%>
                    </form>
                    <button type="submit" class="writing item button post">POST</button>
                </form>
            </div>
        </div>
    </main>
</div>

</body>

</html>