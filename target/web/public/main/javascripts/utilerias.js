// Agrupa celdas comunes
function combinarCeldas(origen){
    //origen = $('#tabla');

    for (r=$("#tabla tr").length-1; r>0 ;r--){
      for (c=$("#tabla tr:nth-child("+r+") td").length; c>=0 ;c--){
              // Corte; se hace corte por la primer columna, forza a que se haga un corte cuando la primer columna es diferente, es decir, si las columnas 4 y 5  son iguales en todos los registros pero la columna 0 difiere; no se agrupan puesto que sus columnas primeras son diferentes.
            var corte=0;
		//	alert(r+"   "+c);
//			alert($("#tabla tr:nth-child("+r+") td:nth-child("+c+")").html()+"\n"  +$("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").html());
            if ($("#tabla tr:nth-child("+r+") td:nth-child("+c+")").html() == $("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").html()){
            	var altura = parseInt($("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").attr('rowspan')) + parseInt($("#tabla tr:nth-child("+r+") td:nth-child("+c+")").attr('rowspan'));
            	$("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").attr('rowspan',altura);
            	$("#tabla tr:nth-child("+r+") td:nth-child("+c+")").remove();
			
          }
        }    
    }
}


function validaFechaDDMMAAAA(fecha){
	var dtCh= "/";
	var minYear=1900;
	var maxYear=2100;
	function isInteger(s){
		var i;
		for (i = 0; i < s.length; i++){
			var c = s.charAt(i);
			if (((c < "0") || (c > "9"))) return false;
		}
		return true;
	}
	function stripCharsInBag(s, bag){
		var i;
		var returnString = "";
		for (i = 0; i < s.length; i++){
			var c = s.charAt(i);
			if (bag.indexOf(c) == -1) returnString += c;
		}
		return returnString;
	}
	function daysInFebruary (year){
		return (((year % 4 == 0) && ( (!(year % 100 == 0)) || (year % 400 == 0))) ? 29 : 28 );
	}
	function DaysArray(n) {
		for (var i = 1; i <= n; i++) {
			this[i] = 31
			if (i==4 || i==6 || i==9 || i==11) {this[i] = 30}
			if (i==2) {this[i] = 29}
		}
		return this
	}
	function isDate(dtStr){
		var dtCh= "/";		
		var daysInMonth = DaysArray(12)
		var pos1=dtStr.indexOf(dtCh)
		var pos2=dtStr.indexOf(dtCh,pos1+1)
		var strDay=dtStr.substring(0,pos1)
		var strMonth=dtStr.substring(pos1+1,pos2)
		var strYear=dtStr.substring(pos2+1)
		strYr=strYear
		if (strDay.charAt(0)=="0" && strDay.length>1) strDay=strDay.substring(1)
		if (strMonth.charAt(0)=="0" && strMonth.length>1) strMonth=strMonth.substring(1)
		for (var i = 1; i <= 3; i++) {
			if (strYr.charAt(0)=="0" && strYr.length>1) strYr=strYr.substring(1)
		}
		month=parseInt(strMonth)
		day=parseInt(strDay)
		year=parseInt(strYr)
		if (pos1==-1 || pos2==-1){
			return false
		}
		if (strMonth.length<1 || month<1 || month>12){
			return false
		}
		if (strDay.length<1 || day<1 || day>31 || (month==2 && day>daysInFebruary(year)) || day > daysInMonth[month]){
			return false
		}
		if (strYear.length != 4 || year==0 || year<minYear || year>maxYear){
			return false
		}
		if (dtStr.indexOf(dtCh,pos2+1)!=-1 || isInteger(stripCharsInBag(dtStr, dtCh))==false){
			return false
		}
		return true
	}
	if(isDate(fecha)){
		return true;
	}else{
		return false;
	}
}

// Determina que tipo de dispositivo (device) detecta bootstrap
function findBootstrapEnvironment() {
    var envs = ["xs", "sm", "md", "lg"],    
        doc = window.document,
        temp = doc.createElement("div");

    doc.body.appendChild(temp);

    for (var i = envs.length - 1; i >= 0; i--) {
        var env = envs[i];

        temp.className = "hidden-" + env;

        if (temp.offsetParent === null) {
            doc.body.removeChild(temp);
            return env;
        }
    }
    return "";
}
