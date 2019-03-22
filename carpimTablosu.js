var satirVstun = 15

document.write("<table border=2 id=table>")

for (let i = 1; i < satirVstun; i++) {
  document.write("<tr>")
  for (let j = 1; j < satirVstun; j++) {

    document.write("<td>" + (i * j) + "</td>")

  }
  document.write("</tr>")
}

document.write("</table>")

document.getElementById('table').style.backgroundColor = "lightblue"
document.getElementById('table').style.borderColor= 'green'
document.getElementById('table').style.textAlign= 'center'

/*Ciktisi: https://goo.gl/UNwFZt */
