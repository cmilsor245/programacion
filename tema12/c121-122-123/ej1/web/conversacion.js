var personaje2, personaje3;

function mostrarPersonajes(){
  personaje2='<%=new Personajes(request.getParameter("nombre2"), "2.png").toString(request.getParameter("saludo2"))%>';
  personaje3='<%=new Personajes(request.getParameter("nombre3"), "3.png").toString(request.getParameter("saludo3"))%>';

  setTimeout(function(){
    var personaje2Element=document.getElementById("personaje2");
    personaje2Element.innerHTML=personaje2;
    personaje2Element.classList.add("fade-in");
  }, 1000);

  setTimeout(function(){
    var personaje3Element=document.getElementById("personaje3");
    personaje3Element.innerHTML=personaje3;
    personaje3Element.classList.add("fade-in");
  }, 2500);

  setTimeout(function(){
    var personajes=document.querySelectorAll(".fade-in");

    personajes.forEach(function(personaje){
      personaje.classList.remove("fade-in");
    });
  }, 3500);
}