<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="../css/styles.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Preguntas</title>
</head>
<body>
        <a href="../index.jsp"> volver</a>
            <div class="form-register">
                <form action="../vistas/pregunta2.jsp" method="post">
                    <h2>1.¿Cual de estas tres ciudades se localizan en las costas del mar caribe?</h2>
                    <img  src="../imagenes/1pregunta.jpeg" alt="croquis"><br>
                <label >
                    <input type="radio" value="1" name="p1">Tumacoi,Buenaventura y nuqui
                </label><br>
                <label >
                    <input type="radio" value="2" name="p1">Santa marta,Barranquilla y Cartagena
                </label><br>
                <label >
                    <input type="radio" value="3" name="p1">Cali,Medellin,Pasto
                </label><br>
                <input type="submit" id="Siguiente" class="botons" value="Siguiente" ></input>
                
                </form>     
        </div>
</body>
</html>