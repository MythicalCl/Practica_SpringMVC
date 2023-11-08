<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed"
                    data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Desplegar navegaci�n</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Ejemplo MVC</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="${pageContext.request.contextPath}/index.jsp">Inicio</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                       role="button" aria-haspopup="true"
                       aria-expanded="false">Autores <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Registrar autor</a></li>
                        <li><a href="#">Ver lista de autores</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                       role="button" aria-haspopup="true"
                       aria-expanded="false">Generos<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Registrar genero</a></li>
                        <li><a href="#">Ver lista de generos</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                       role="button" aria-haspopup="true"
                       aria-expanded="false">Libros<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Registrar libro</a></li>
                        <li><a href="#">Ver lista de libros</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                       role="button" aria-haspopup="true"
                       aria-expanded="false">Editoriales<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/editoriales/create">Registrar editorial</a></li>
                        <li><a href="${pageContext.request.contextPath}/editoriales/list">Ver lista de editoriales</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav pull-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">Lenguaje<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="?locale=es">Español</a></li>
                        <li><a href="?locale=en">Ingles</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

