<h1> FACULDADE DE PETROLINA (FACAPE)</h1>

<h2> Feito por Ariel Rodrigues </h2>

<h3> Projeto de III avaliação de Sistemas Distribuídos </h3>

### O objetivo desse projeto é desenvolver um pequeno sistema distribuído de servidores utilizando RMI (Calculadora). O sistema é composto de um webservice rest que encaminhará as operações via RMI para os servidores especialistas.

### <li> O servidor 1 é composto por: </li>
<ul>
  <li>Soma</li>
  <li>Subtração</li>
  <li>Multiplicação</li>  
  <li>Divisão</li>
</ul>

### <li> O servidor 2 é composto por: </li>
<ul>
  <li>Porcentagem</li>
  <li>Raiz quadrada</li>
  <li>Potenciação</li>
</ul>

### <li> As portas e os servidores: </li>
<ul>
  <li>Porta Webservice: 8000</li>
  <li>Porta ServidorBasico: 50996</li>
  <li>Porta ServidorEspecialista: 50997</li>
</ul>

<h3>A execução</h3>
<p>A calculadora RMI consegue executar um webservice com dois servidores (ServidorBasico e ServidorEspecialista). Juntos com as interfaces e os implementos
das classes para a execução. O Library envia as portas dos servidores especialistas para o webservice que vai utilizar a rota para a porta 8000. Os servidores especialistas transmitem as mensagens para o webservice e são enviados ao post para realizar as operações matemáticas utilizando os dois números.</p>
