function Avaliar(estrela) {


    var url = window.location;
    url = url.toString()
    url = url.split("index.html");
    url = url[0];

    var s1 = document.getElementById("s1").src;
    var s2 = document.getElementById("s2").src;
    var s3 = document.getElementById("s3").src;
    var s4 = document.getElementById("s4").src;
    var s5 = document.getElementById("s5").src;
    //var avaliacao = 0;

    if (estrela == 5) {
        if (s5 == "https://i.ibb.co/4YL84Hk/starvazia.png") {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s4").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s5").src = "https://i.ibb.co/s36vZvf/star.png";
            //avaliacao = 5;
        } else {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s4").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 4;
        }
    }

    //ESTRELA 4
    if (estrela == 4) {
        if (s4 == "https://i.ibb.co/4YL84Hk/starvazia.png") {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s4").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 4;
        } else {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
           // avaliacao = 3;
        }
    }

    //ESTRELA 3
    if (estrela == 3) {
        if (s3 == "https://i.ibb.co/4YL84Hk/starvazia.png") {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 3;
        } else {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 2;
        }
    }

    //ESTRELA 2
    if (estrela == 2) {
        if (s2 == "https://i.ibb.co/4YL84Hk/starvazia.png") {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 2;
        } else {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s3").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 1;
        }
    }

    //ESTRELA 1
    if (estrela == 1) {
        if (s1 == "https://i.ibb.co/4YL84Hk/starvazia.png") {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s3").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 1;
        } else {
            document.getElementById("s1").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s2").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s3").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
           // avaliacao = 0;
        }
    }

    //document.getElementById('rating').innerHTML = avaliacao;

}


function Buscar() {

    var dados=
        [   ["Dorflex","DORES MUSCULARES"],
            ["Buscofem", "CÓLICAS MENSTRUAIS"],
            ["ACETATO_DE_MEDROXIPROGESTERONA_150MG","ANTICONCEPÇÃO"],
            ["ALENDRONATO DE SÓDIO 70MG", "OSTEOPOROSE"],
            ["ATENOLOL 25MG", "HIPERTENSÃO (PRESSÃO ALTA)"],
            ["BROMETO DE IPRATRÓPIO 0,02MG", "ASMA"],
            ["BROMETO DE IPRATRÓPIO 0,25MG", "ASMA"],
            ["BUDESONIDA 32MCG", "RINITE"],
            ["CAPTOPRIL 25MG ", "HIPERTENSÃO (PRESSÃO ALTA)"],
            ["CARBIDOPA 25MG + LEVODOPA 250MG", "PARKINSON"],
            ["CLORIDRATO DE BENSERAZIDA 25MG + LEVODOPA 100MG","PARKINSON"],
            ["CLORIDRATO DE METFORMINA 500MG", "DIABETES"],
            ["MALEATO DE TIMOLOL 2,5MG", "GLAUCOMA"],
            ["SINVASTATINA 10MG", "DISLIPDEMIA (COLESTEROL ALTO)"]
    ];

    var tbody = document.getElementById("tbody");
    for(var i=0; i<dados.length; i++) //Inserir itens na tabela
    {
        var tr ="<tr>" +
            "<td>" + dados[i] + "</td>" +
            "</tr>";

        tbody.innerHTML += tr;
        var tr = tbody.childNodes;
        console.log(tr.value);
    }

   
    var busca = document.getElementById("txtBusca").value.toUpperCase();
    console.clear();

    for(var i =0; i<tbody.childNodes.length; i++)
    {
        console.clear();
        var achou = false;
        var tr = tbody.childNodes[i];
        var td = tr.childNodes;

        for(var j=0; j< td.length; j++)
        {
            var value = td[j].childNodes[0].nodeValue.toUpperCase();
            console.log(value);

            if(value.indexOf(busca)>=0)
            {
                achou = true;
        
            }
        }
        if(achou==true){
            tr.style.display = "table-row";   
        }else{
            tr.style.display = "none";

        }
        
    }
    

    

}

function Buscarf()

{
    var botao = document.getElementById("search");
    botao.addEventListener('click', function() {

        alert(document.getElementById("txtBusca").value);

    })
}

function Cadastro()
{
    
    var nome = document.getElementById("name").value;
    var birthdate = document.getElementById("birthdate").value;
    var gender = document.getElementById("gender").value;
    var email = document.getElementById("email").value;
    var user = document.getElementById("user").value;
    var psw = document.getElementById("psw").value;

}

function Login(){

    var done=0;
    var username = document.getElementById("uname").value;
    var password = document.getElementById("pwd").value;
 
    if (username =="manu" && password=="123") { window.location="http://localhost:8080/user.html"; done=1; }
    if (username =="joel" && password=="123") { window.location="http://localhost:8080/user.html"; done=1; }
    if (done==0) { alert("Senha ou Usuário inválido." + document.getElementById("uname").value); }

    


}