    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>
<style>
  .HipervinculoAdmon{
    color:#000000;
	text-decoration:none;
  }
  
  .HipervinculoAdmon:hover{
    color:#006666;
	text-decoration:underline;
  }
</style>
<script language="javascript" type="text/javascript">
<!--
  function EliminarAuto(strAutoPlaca){
    return confirm("¿Desea eliminar el Auto '" + strAutoPlaca + "'?")
  }
-->
</script>
    <br>
    <font size='5'><fmt:message key="formaListadoAutos.titulo" /></font>
    <div class="table" style="width:100%" >
        <div class="tr">
            <div class="td" colspan="4" style="padding-top:25px; padding-bottom:25px;">
                <a href="solicitarRegistroAutos.do" class="HipervinculoAdmon boton">Agregar nuevo Auto...</a>
            </div>
        </div>
        <div class="tr">
            <div class="td" colspan="4">
               <html:errors />
            </div>
        </div>
        <div class="tr" style="background:#CCCCCC">
         <div class="td" style="width:20%"><b><fmt:message key="formaListadoAutos.etiqueta.nombre" /></b></div>
         <div class="td" style="width:58%;border-right-style:solid; border-left-style:solid; border-width:1px; border-color:#000000;"><b><fmt:message key="formaListadoAutos.etiqueta.descripcion" /></b></div>
         <div class="td" style="width:20%"><b><fmt:message key="formaListadoAutos.etiqueta.administracion" /></b></div>
        </div>
        <c:forEach var="auto" items="${formaListadoAutos.autos}">
            <div class="tr">
                <div class="td" align="left" style="width:20%"><c:out value="${auto.marca}"/></div>
                <div class="td" align="left" style="width:58%"><c:out value="${auto.color}"/></div>
                <div class="td" align="left" style="width:58%"><c:out value="${auto.placa}"/></div>
                <div class="td" align="left" style="width:58%"><c:out value="${auto.propietario}"/></div>
                <div class="td" align="left" style="width:58%"><c:out value="${auto.estado}"/></div>
                <div class="td" align="left" style="width:58%"><c:out value="${auto.pais}"/></div>
                <div class="td" align="left" style="width:20%">
                    <a href='solicitarModificarAutos.do?id=<c:out value="${auto.idAuto}"/>'
					   class="HipervinculoAdmon">
                        <fmt:message key="formaListadoAutos.etiqueta.modificar" />
                    </a>
                    <a href='procesarEliminarAutos.do?id=<c:out value="${auto.idAuto}"/>'
					   onClick="javascript: return EliminarAuto('<c:out value="${auto.marca}"/>')"
					   class="HipervinculoAdmon">
                        <fmt:message key="formaListadoAutos.etiqueta.eliminar" />
                    </a>
                </div>
            </div>
        </c:forEach>
        <div class="tr">
            <div class="td" colspan="4" align="right" style="padding-top:25px;"><b>Total:</b> ${formaListadoAutos.contador}</div>
        </div>
    </div>