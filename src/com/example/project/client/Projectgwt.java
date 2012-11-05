package com.example.project.client;

import com.example.project.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.i18n.client.Constants.DefaultStringValue;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.widget.client.*;
import com.google.gwt.xml.client.Text;



public class Projectgwt implements EntryPoint {
	
	

	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	private final CalculatorServiceAsync calcService = GWT
			.create(CalculatorService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		AbsolutePanel hp = new AbsolutePanel();
		hp.setLayoutData(hp);
       // hp.setSpacing(10);
		
		hp.addStyleName("calc");
		hp.setTitle("Simple");
		Button addButton = new Button("+");
		addButton.setStyleName("but");
		
		Button subButton = new Button("-");
		subButton.setStyleName("but2");
		
		Button mulButton = new Button("*");
		mulButton.setStyleName("but3");
		
		Button divButton = new Button("/");
		divButton.setStyleName("but4");
		
		Button modButton = new Button("mod");
		modButton.setStyleName("but5");
		
		Button sqrtsButton = new Button("sqrt");
		sqrtsButton.setStyleName("but6");
		
		Button revButton = new Button("1/x");
		revButton.setStyleName("but7");
		
		
		final TextBox l1 = new TextBox();
		l1.setText("wartość 1");
		l1.addStyleName("label1");
		l1.setPixelSize(150, 20);
		
		final TextBox l2 = new TextBox();
		l2.setPixelSize(150, 20);
		l2.setText("wartość 2");
		l2.addStyleName("label2");
		
		
		final TextBox l9 = new TextBox();
		l9.setPixelSize(150, 20);
		l9.setText("podaj wartość");
		l9.addStyleName("label9");
		
		final Label wynik = new Label("czekam na wynik ... ");
		wynik.addStyleName("result");
		wynik.setPixelSize(200, 50);
		
	
	    
	    
	    
		
		hp.add(wynik);
		hp.add(l1);
		hp.add(l2);
		hp.add(addButton);
		hp.add(subButton);
		hp.add(mulButton);
		hp.add(divButton);
		hp.add(l9);
		hp.add(modButton);
		hp.add(sqrtsButton);
		hp.add(revButton);
		
		RootPanel.get("mainContainer").add(hp);
		
		
		//energia
		
		
		AbsolutePanel zp = new AbsolutePanel();
		zp.setLayoutData(zp);
       // hp.setSpacing(10);
		
		zp.addStyleName("calc3");
		zp.setTitle("Simple3");
		
		 // Create a Label and an HTML widget.
	    Label lbl = new Label("Dżule / Kaloria: ");
	    
	    Label lbl1 = new Label("Kilodżule / Kilokaloria: ");
		
		
		final TextBox l10 = new TextBox();
		
		l10.addStyleName("label10");
		l10.setPixelSize(150, 20);
		
		
		final TextBox l11 = new TextBox();
		
		l11.addStyleName("label11");
		l11.setPixelSize(150, 20);
		
	
		
	
	  
	   
	    

		
		zp.add(lbl);
		zp.add(l10);
		zp.add(lbl1);
		zp.add(l11);
	
		
		
		RootPanel.get("mainContainer3").add(zp);
		
		
	//masa /ciezar
		
		
		AbsolutePanel mp = new AbsolutePanel();
		mp.setLayoutData(mp);
       // hp.setSpacing(10);
		
		mp.addStyleName("calc4");
		mp.setTitle("Simple5");
		
		
	    
	    final Label wynik11 = new Label("Czekam na wynik ... ");
		wynik11.addStyleName("result11");
		wynik11.setPixelSize(200, 30);
		
	    final Label lb4 = new Label("Kilogram ");
	    
	    
	    final TextBox l12 = new TextBox();
		
		l12.addStyleName("label12");
		l12.setPixelSize(150, 20);
		
		
	
		
		  final RadioButton rb11 = new RadioButton("group","mg");
		  final RadioButton rb21 = new RadioButton("group","dg");
		  final RadioButton rb31 = new RadioButton("group","g");
		  final RadioButton rb41 = new RadioButton("group","dag");
		  final RadioButton rb51 = new RadioButton("group","tona");
		
		  rb11.addStyleName("rb11");
		    rb21.addStyleName("rb21");
		    rb31.addStyleName("rb31");
		    rb41.addStyleName("rb41");
		    rb51.addStyleName("rb51");
	  
	   
	    

		mp.add(wynik11);
		mp.add(lb4);
		mp.add(l12);
		mp.add(rb11);
		mp.add(rb21);
		mp.add(rb31);
		mp.add(rb41);
		mp.add(rb51);
		
	
		
		
		RootPanel.get("mainContainer4").add(mp);
		
		
		//dec to other
		
		
		AbsolutePanel ap = new AbsolutePanel();
		ap.setLayoutData(ap);
       // hp.setSpacing(10);
		
		ap.addStyleName("calc1");
		ap.setTitle("Simple2");

		
		
		final TextBox l3 = new TextBox();
		l3.setText("wartość w dec ");
		l3.addStyleName("label3");
		l3.setPixelSize(150, 20);
		
		

		
		
		final Label wynik2 = new Label("czekam na wynik ... ");
		wynik2.addStyleName("result2");
		wynik2.setPixelSize(200, 50);
		
	
	    
	    final RadioButton rb1 = new RadioButton("group","Bin");
	    final RadioButton rb2 = new RadioButton("group","Oct");
	    final RadioButton rb3 = new RadioButton("group","Hex");
	   
	    
		    rb1.addStyleName("rb1");
		    rb2.addStyleName("rb2");
		    rb3.addStyleName("rb3");
		
		ap.add(wynik2);
		ap.add(l3);
		ap.add(rb1);
		ap.add(rb2);
		ap.add(rb3);
		
		
		RootPanel.get("mainContainer1").add(ap);
		
		//other to dec
		
		AbsolutePanel pp = new AbsolutePanel();
		ap.setLayoutData(pp);
       // hp.setSpacing(10);
		
		pp.addStyleName("calc2");
		pp.setTitle("Simple3");

		
		
		final TextBox l4 = new TextBox();
		l4.setText("wartość");
		l4.addStyleName("label4");
		l4.setPixelSize(150, 20);
		
		

		
		
		final Label wynik3 = new Label("czekam na wynik ... ");
		wynik3.addStyleName("result3");
		wynik3.setPixelSize(200, 50);
		
	
	    
	    final RadioButton rb4 = new RadioButton("group","Bin");
	    final RadioButton rb5 = new RadioButton("group","Oct");
	    final RadioButton rb6 = new RadioButton("group","Hex");
	   
	    
	    rb4.addStyleName("rb4");
	    rb5.addStyleName("rb5");
	    rb6.addStyleName("rb6");
		
		pp.add(wynik3);
		pp.add(l4);
		pp.add(rb4);
		pp.add(rb5);
		pp.add(rb6);
		
		
		RootPanel.get("mainContainer2").add(pp);
		
		
		
		rb11.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.mg(Integer.parseInt(l12.getText()),new AsyncCallback<Double>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik11.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Double result) {
						wynik11.setText("" + result);
						
					}
				});
				
			}
		});
		
	rb21.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.dg(Integer.parseInt(l12.getText()),new AsyncCallback<Double>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik11.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Double result) {
						wynik11.setText("" + result);
						
					}
				});
				
			}
		});
	
	rb31.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			calcService.g(Integer.parseInt(l12.getText()),new AsyncCallback<Double>() {

				@Override
				public void onFailure(Throwable caught) {
					wynik11.setText(SERVER_ERROR);
					
				}

				@Override
				public void onSuccess(Double result) {
					wynik11.setText("" + result);
					
				}
			});
			
		}
	});
		
	
	rb41.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			calcService.dag(Integer.parseInt(l12.getText()),new AsyncCallback<Double>() {

				@Override
				public void onFailure(Throwable caught) {
					wynik11.setText(SERVER_ERROR);
					
				}

				@Override
				public void onSuccess(Double result) {
					wynik11.setText("" + result);
					
				}
			});
			
		}
	});
	
	rb51.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			calcService.tona(Integer.parseInt(l12.getText()),new AsyncCallback<Double>() {

				@Override
				public void onFailure(Throwable caught) {
					wynik11.setText(SERVER_ERROR);
					
				}

				@Override
				public void onSuccess(Double result) {
					wynik11.setText("" + result);
					
				}
			});
			
		}
	});
	    
	    
	
		
		//other to dec
		
		rb4.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.otherToDec(l4.getText(), 2, new AsyncCallback<Integer>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik3.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Integer result) {
						wynik3.setText("" + result);
						
					}
				});
				
			}
		});
		
		
		rb5.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.otherToDec(l4.getText(), 8, new AsyncCallback<Integer>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik3.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Integer result) {
						wynik3.setText("" + result);
						
					}
				});
				
			}
		});
		
		
		
		rb6.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.otherToDec(l4.getText(), 16, new AsyncCallback<Integer>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik3.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Integer result) {
						wynik3.setText("" + result);
						
					}
				});
				
			}
		});
		
		
		//dec to other
		rb1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.decToOther(Integer.parseInt(l3.getText()), 2, new AsyncCallback<String>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik2.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(String result) {
						wynik2.setText("" + result);
						
					}
				});
				
			}
		});
		
	
		
	   l11.addKeyUpHandler(new KeyUpHandler() 
	   {
			
			@Override
			public void onKeyUp(KeyUpEvent event) {
				calcService.dzul(Integer.parseInt(l11.getText()), new AsyncCallback<Double>() {

					@Override
					public void onFailure(Throwable caught) {
						l10.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Double result) {
						l10.setText("" + result);
						
					}
				});
				
			}
		});
	   
	   
	   l10.addKeyUpHandler(new KeyUpHandler() 
	   {
			
			@Override
			public void onKeyUp(KeyUpEvent event) {
				calcService.kj(Integer.parseInt(l10.getText()), new AsyncCallback<Double>() {

					@Override
					public void onFailure(Throwable caught) {
						l11.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Double result) {
						l11.setText("" + result);
						
					}
				});
				
			}
		});
		
		
		rb2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.decToOther(Integer.parseInt(l3.getText()), 8, new AsyncCallback<String>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik2.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(String result) {
						wynik2.setText("" + result);
						
					}
				});
				
			}
		});
		
		
		rb3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.decToOther(Integer.parseInt(l3.getText()), 16, new AsyncCallback<String>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik2.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(String result) {
						wynik2.setText("" + result);
						
					}
				});
				
			}
		});
		
		addButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.add(Integer.parseInt(l1.getText()), Integer.parseInt(l2.getText()), new AsyncCallback<Integer>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Integer result) {
						wynik.setText("" + result);
						
					}
				});
				
			}
		});
		
	modButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.mod(Integer.parseInt(l1.getText()), Integer.parseInt(l2.getText()), new AsyncCallback<Integer>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Integer result) {
						wynik.setText("" + result);
						
					}
				});
				
			}
		});
	

	
	
			
	
		subButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.sub(Integer.parseInt(l1.getText()), Integer.parseInt(l2.getText()), new AsyncCallback<Integer>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Integer result) {
						wynik.setText("" + result);
						
					}
				});
				
			}
		});
		
	mulButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				calcService.mul(Integer.parseInt(l1.getText()), Integer.parseInt(l2.getText()), new AsyncCallback<Double>() {

					@Override
					public void onFailure(Throwable caught) {
						wynik.setText(SERVER_ERROR);
						
					}

					@Override
					public void onSuccess(Double result) {
						wynik.setText("" + result);
						
					}
				});
				
	 
				
			}
		});
	
	
	revButton.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			calcService.rev(Double.parseDouble(l9.getText()), new AsyncCallback<Double>() {

				@Override
				public void onFailure(Throwable caught) {
					wynik.setText(SERVER_ERROR);
					
				}

				@Override
				public void onSuccess(Double result) {
					wynik.setText("" + result);
					
				}
			});
			
 
			
		}
	});
	
	divButton.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			calcService.div(Integer.parseInt(l1.getText()), Integer.parseInt(l2.getText()), new AsyncCallback<Double>() {

				@Override
				public void onFailure(Throwable caught) {
					wynik.setText(SERVER_ERROR);
					
				}

				@Override
				public void onSuccess(Double result) {
					wynik.setText("" + result);
					
				}
			});
			
 
			
		}
	});
	
	
	
	sqrtsButton.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			calcService.sqrts(Double.parseDouble(l9.getText()), new AsyncCallback<Double>() {

				@Override
				public void onFailure(Throwable caught) {
					wynik.setText(SERVER_ERROR);
					
				}

				@Override
				public void onSuccess(Double result) {
					wynik.setText("" + result);
					
				}
			});
			
 
			
		}
	});
	}
}
