package controllers;

import java.util.Arrays;
import models.Aspecto;
import models.ClasificadorCriterio2;
import models.ClasificadorCriterio3;
import models.EvaluacionTabla;
import models.EvaluacionTablaReactivo;
import models.EvaluacionTablaVersion;
import play.mvc.*;

public class auxCargaDatosController {
	
	
	public static Result cargaEvaluacionTabla(){		
		
		EvaluacionTablaVersion etv = new EvaluacionTablaVersion();
		etv.version = 1L;
		etv.save();
		//etv.refresh();
		
		for(Long vetr=1L; vetr<=282L; vetr++){
System.out.println("Generando "+vetr+" de 282");			
			if (   Arrays.asList(new Long[]{3L,4L,5L,8L,10L,11L,13L,17L,19L,43L,79L,81L,125L,126L}).contains(vetr) ){
						for (ClasificadorCriterio2 cc2 : ClasificadorCriterio2.find.all()){				
							for (ClasificadorCriterio3 cc3 : ClasificadorCriterio3.find.all()){
								EvaluacionTabla et = new EvaluacionTabla();
								et.version = etv;
								et.reactivo = EvaluacionTablaReactivo.find.byId(vetr);
										if (       ( cc2.criterio1.id == 1      && cc2.id == 1         && Arrays.asList( new Long[]{1L,2L}).contains( cc3.id  ))
												   ||	
												   ( cc2.criterio1.id == 1      && cc2.id == 2         && Arrays.asList( new Long[]{1L,2L, 3L}).contains( cc3.id  ))
												   ||	
												   ( cc2.criterio1.id == 1      && cc2.id == 3         && Arrays.asList( new Long[]{1L,2L, 3L}).contains( cc3.id  ))									
												   ||	
												   ( cc2.criterio1.id == 2      && Arrays.asList(new Long[]{4L,5L,6L}).contains(cc2.id)         && Arrays.asList( new Long[]{5L,6L}).contains( cc3.id  ))
												   	
											   ){
													et.criterio1 = cc2.criterio1;
													et.criterio2 = cc2;
													et.criterio3 = cc3;														
													if (
															(et.reactivo.id >= 4  &&  et.reactivo.id <= 6)
															||												
															(et.reactivo.id >= 8  &&  et.reactivo.id <= 12)
															||												
															(et.reactivo.id >= 14  &&  et.reactivo.id <= 26)
															||												
															(et.reactivo.id >= 31  &&  et.reactivo.id <= 46)
															||
															(et.reactivo.id == 56)
															||
															(et.reactivo.id >= 66 &&  et.reactivo.id <= 69)
															||
															(et.reactivo.id >= 78 &&  et.reactivo.id <= 84)
															||
															(et.reactivo.id == 86)
															||
															(et.reactivo.id == 87)
															||
															(et.reactivo.id >= 90 &&  et.reactivo.id <= 126)
															||
															(et.reactivo.id >= 137 &&  et.reactivo.id <= 142)
													   )
														et.aspecto = Aspecto.find.byId(1L);
													else
														if (
																(et.reactivo.id >= 1  &&  et.reactivo.id <= 3)
																||
																(et.reactivo.id == 7)
																||
																(et.reactivo.id == 13)
																||
																(et.reactivo.id >= 28  &&  et.reactivo.id <= 30)
																||
																(et.reactivo.id >= 47  &&  et.reactivo.id <= 55)
																||
																(et.reactivo.id >= 57  &&  et.reactivo.id <= 65)
																||
																(et.reactivo.id >= 70  &&  et.reactivo.id <= 72)
																||
																(et.reactivo.id == 85)
																||
																(et.reactivo.id >= 88  &&  et.reactivo.id <= 89)
																||
																(et.reactivo.id >= 127  &&  et.reactivo.id <= 136)
																||
																(et.reactivo.id >= 143  &&  et.reactivo.id <= 197)
																											
														   )
															et.aspecto = Aspecto.find.byId(2L);
														else
															if (
																	(et.reactivo.id == 27)
																	||
																	(et.reactivo.id >= 73  &&  et.reactivo.id <= 77)
																	||
																	(et.reactivo.id >= 198  &&  et.reactivo.id <= 246)
															   )
																et.aspecto = Aspecto.find.byId(3L);
															else
																if (
						
																		(et.reactivo.id >= 247  &&  et.reactivo.id <= 282)
																   )
																	et.aspecto = Aspecto.find.byId(4L);		
													
													etv.evaluacionTablas.add(et);	
													//et.save();																			
												}
								}
						}
			}else {
				for (ClasificadorCriterio2 cc2 : ClasificadorCriterio2.find.all()){				
					for (ClasificadorCriterio3 cc3 : ClasificadorCriterio3.find.all()){
						EvaluacionTabla et = new EvaluacionTabla();
						et.version = etv;
						et.reactivo = EvaluacionTablaReactivo.find.byId(vetr);
											if (       (cc2.criterio1.id == 1      && cc2.id == 1         && Arrays.asList( new Long[]{1L,2L}).contains( cc3.id  ))
													   ||	
													   (cc2.criterio1.id == 1      && cc2.id == 2         && Arrays.asList( new Long[]{1L,2L, 3L}).contains( cc3.id  ))
													   ||	
													   (cc2.criterio1.id == 1      && cc2.id == 3         && Arrays.asList( new Long[]{1L,2L, 3L,4L}).contains( cc3.id  ))									
													   ||	
													   (cc2.criterio1.id == 2      && Arrays.asList(new Long[]{4L,5L,6L}).contains(cc2.id)         && Arrays.asList( new Long[]{5L,6L}).contains( cc3.id  ))
													   	
											   ){
													et.criterio1 = cc2.criterio1;
													et.criterio2 = cc2;
													et.criterio3 = cc3;											
												
										
											
													if (
															(et.reactivo.id >= 4  &&  et.reactivo.id <= 6)
															||												
															(et.reactivo.id >= 8  &&  et.reactivo.id <= 12)
															||												
															(et.reactivo.id >= 14  &&  et.reactivo.id <= 26)
															||												
															(et.reactivo.id >= 31  &&  et.reactivo.id <= 46)
															||
															(et.reactivo.id == 56)
															||
															(et.reactivo.id >= 66 &&  et.reactivo.id <= 69)
															||
															(et.reactivo.id >= 78 &&  et.reactivo.id <= 84)
															||
															(et.reactivo.id == 86)
															||
															(et.reactivo.id == 87)
															||
															(et.reactivo.id >= 90 &&  et.reactivo.id <= 126)
															||
															(et.reactivo.id >= 137 &&  et.reactivo.id <= 142)
													   )
														et.aspecto = Aspecto.find.byId(1L);
													if (
															(et.reactivo.id >= 1  &&  et.reactivo.id <= 3)
															||
															(et.reactivo.id == 7)
															||
															(et.reactivo.id == 13)
															||
															(et.reactivo.id >= 28  &&  et.reactivo.id <= 30)
															||
															(et.reactivo.id >= 47  &&  et.reactivo.id <= 55)
															||
															(et.reactivo.id >= 57  &&  et.reactivo.id <= 65)
															||
															(et.reactivo.id >= 70  &&  et.reactivo.id <= 72)
															||
															(et.reactivo.id == 85)
															||
															(et.reactivo.id >= 88  &&  et.reactivo.id <= 89)
															||
															(et.reactivo.id >= 127  &&  et.reactivo.id <= 136)
															||
															(et.reactivo.id >= 143  &&  et.reactivo.id <= 197)																										
													   )
														et.aspecto = Aspecto.find.byId(2L);
													if (
															(et.reactivo.id == 27)
															||
															(et.reactivo.id >= 73  &&  et.reactivo.id <= 77)
															||
															(et.reactivo.id >= 198  &&  et.reactivo.id <= 246)
													   )
														et.aspecto = Aspecto.find.byId(3L);
													if (
			
															(et.reactivo.id >= 247  &&  et.reactivo.id <= 282)
													   )
														et.aspecto = Aspecto.find.byId(4L);										
														
													etv.evaluacionTablas.add(et);	
													//et.save();							
											}	
								}					
				}
			
		}
		}
		etv.save();
		return play.mvc.Results.ok("Se generó tabla EvaluacionTablaVersion("+EvaluacionTablaVersion.find.findRowCount()+") y  evaluacion_tabla ("+EvaluacionTabla.find.findRowCount()+")");
	}
			
}

	
	
	

