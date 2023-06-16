<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
    <link rel="stylesheet" href="css/reset.css" />
    <link rel="stylesheet" href="css/index.css" />
  </head>
  <body>
    <!-- Header Area -->
    <header class="header">
      <div class="header-logo">
        <a href="">
          <img
            src="img/pikapedia-logo.svg"
            alt="pikapedia-logo"
            id="pikapedia-logo"
          />
        </a>
      </div>
      <div class="menu-area">
        <ul class="header-icons">
          <li>
            <a href=""
              ><img
                src="img/icon/sun-icon.png"
                alt="bright-mode"
                class="header-icons"
            /></a>
          </li>
          <li>
            <a href=""
              ><img
                src="img/icon/moon-icon.png"
                alt="dark-mode"
                class="header-icons"
            /></a>
          </li>
          <li>
            <a href=""
              ><img
                src="img/icon/korea-icon.png"
                alt="korean-button"
                class="header-icons"
            /></a>
          </li>
          <li>
            <a href=""
              ><img
                src="img/icon/japan-icon.png"
                alt="japanese-button"
                class="header-icons"
            /></a>
          </li>
        </ul>
        <!-- 드롭다운 메뉴 -->
        <ul class="drop-menu">
          <li><a href="./jsp/quizHome.jsp">Quiz</a></li>
          <li><a href="./jsp/myRewards.jsp">My Rewards</a></li>
          <li><a href="./jsp/community.jsp">Community</a></li>
          <li><a href="./jsp/login.jsp">Login</a></li>
          <li><a href="./jsp/join.jsp">Join</a></li>
        </ul>
      </div>
    </header>

    <!-- Article Area -->
    <article>
      <div class="pokemon-main">
        <jsp:include page="${contentPage }"></jsp:include>
      </div>
    </article>

    <!-- Footer Area -->
    <footer>footer area</footer>
  </body>
</html>
