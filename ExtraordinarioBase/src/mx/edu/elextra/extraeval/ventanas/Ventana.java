public class Ventana extends JFrame{
	public Ventana(){
		initComponents();
		setJMenuBar(mb);
		mb.add(mnFile);
		mnFile.add(miOpen);
		mnFile.addSeparator();
		mnFile.add(miSalir);
		mb.add(mnSort);
		mnSort.add(miMarca);
		mnSort.add(miCosto);
		add(lbMarca);
		add(txMarca);
		add(lbCosto);
		add(txCosto);
		add(lbRamP);
		add(txRamP);
		add(btnPrev);
		add(lbIdx);
		add(btnNext);
		add(lbTipoOrd);
	}
	private void initComponents(){
		// Establecer el el tipo de JFrame como un FlowLayout
        setLayout(new FlowLayout());

		// Establecer el cierre de la aplicación al cerrar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mb = new JMenuBar();

		// Crear la Barra de Menú mb
		setJMenuBar(mb);
		menu = new JMenu("");
		mb.add(menu);

		miMarca = new JMenu
		// Crear el Menú mnFile "Archivo"
		// Crear el Menú Item miOpen "Abrir"
		// Agregar al miOpen la clase anónima que manda llamar a los métodos siguientes: 
				Procesos.openFile();
				Procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);
		//
		// Crear el Menú Item miOpen "Salir"
		// Agregar al miOpen la clase anónima que manda llamar al método siguientes:
				dispose();
		// Crear el menú mnSort "Ordenar por ..."
		// Crear el Menú Item miMarca "Marca"
		// Crear el Menú Item miCosto "Costo"

		// Crear la etiqueta lbMarca "Marca"
		lbMarca = new JLabel("Marca");
		add(lbMarca)				
		// Crear la etiqueta lbMarca "Costo"
		lbMarca = new JLabel("Costo");
		add(lbMarca)		
		// Crear la etiqueta lbRamP "Ram/Proc"
		lbRamP = new JLabel("Ram/Proc");
		add(lbRamP)		

		
		// Crear el campo de texto txMarca de tamaño 20
		txMarca = new JTextField(20);
		add(txMarca);				
		// Crear el campo de texto txCosto de tamaño 20
		txCosto = new JTextField(20);
		add(txCosto);		
		// Crear el campo de texto txRamP de tamaño 20
		txRamP = new JTextField(10);
		add(txRamP);		

		// Crear el botón btnPrev " <- "
		// Crear el botón btnNext " -> "

		// Crear la etiqueta lbIdx "0/0"
		lbIdx = new JLabel("0/0");
		add(lbIdx)			
		
		String espacios = "       ";
		// Crear la etiqueta Label ordenando lbTipoOrd espacios+"Tipo de Ordenamiento"+espacios
		
		// Agregar al btnPrev la clase anónima que manda llamar al método siguientes:
				Procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);

		// Agregar al btnNext la clase anónima que manda llamar al método siguientes:
				Procesos.getNext(txMarca, txCosto, txRamP, lbIdx);

		// Agregar al miMarca la clase anónima que manda llamar a los métodos siguientes: 
				lbTipoOrd.setText(espacios+"Ordenados por Marca"+espacios);
				Procesos.sortMarca();

		// Agregar al miCosto la clase anónima que manda llamar a los métodos siguientes: 
				lbTipoOrd.setText(espacios+"Ordenados por Costo"+espacios);
				Procesos.sortCosto();
		setSize(330,350);
	}
	JMenuBar mb;
	JMenu mnFile,mnSort;
	JMenuItem miOpen, miSalir, miMarca, miCosto;
	JLabel lbMarca, lbModelo, lbCosto, lbRamP, lbTipoOrd, lbIdx;
	JTextField txMarca, txCosto, txRamP;
	JButton btnPrev, btnNext;
}
