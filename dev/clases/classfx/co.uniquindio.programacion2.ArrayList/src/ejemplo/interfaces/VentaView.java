package ejemplo.interfaces;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class VentaView extends ApplicationWindow {
	private Table table;
	private Table table_1;
	private Text text;

	/**
	 * Create the application window.
	 */
	public VentaView() {
		super(null);
		createActions();
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
	}

	/**
	 * Create contents of the application window.
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		
		TabFolder tabFolder = new TabFolder(container, SWT.NONE);
		tabFolder.setBounds(10, 10, 737, 577);
		
		TabItem tbtmCrudCliente = new TabItem(tabFolder, SWT.NONE);
		tbtmCrudCliente.setText("Crud cliente");
		
		TabItem tbtmCrudProductos = new TabItem(tabFolder, SWT.NONE);
		tbtmCrudProductos.setText("Crud productos");
		
		TabItem tbtmVentas = new TabItem(tabFolder, SWT.NONE);
		tbtmVentas.setText("Ventas");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmVentas.setControl(composite);
		composite.setLayout(new FormLayout());
		
		Group grpInformacionDeLa = new Group(composite, SWT.NONE);
		FormData fd_grpInformacionDeLa = new FormData();
		fd_grpInformacionDeLa.top = new FormAttachment(0, 10);
		fd_grpInformacionDeLa.left = new FormAttachment(0, 10);
		fd_grpInformacionDeLa.right = new FormAttachment(100, -42);
		fd_grpInformacionDeLa.bottom = new FormAttachment(0, 189);
		grpInformacionDeLa.setLayoutData(fd_grpInformacionDeLa);
		grpInformacionDeLa.setText("Informacion de sede");
		
		Group grpListaDeVentas = new Group(composite, SWT.NONE);
		
		Combo combo = new Combo(grpInformacionDeLa, SWT.NONE);
		combo.setItems(new String[] {"Armenia", "Circasia"});
		combo.setBounds(84, 24, 203, 23);
		
		Label lblSede = new Label(grpInformacionDeLa, SWT.NONE);
		lblSede.setBounds(22, 27, 55, 15);
		lblSede.setText("Sede");
		
		table_1 = new Table(grpInformacionDeLa, SWT.BORDER | SWT.FULL_SELECTION);
		table_1.setBounds(22, 64, 626, 97);
		table_1.setHeaderVisible(true);
		table_1.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn_4 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_4.setWidth(100);
		tblclmnNewColumn_4.setText("New Column");
		
		TableColumn tblclmnNewColumn_5 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_5.setWidth(100);
		tblclmnNewColumn_5.setText("New Column");
		FormData fd_grpListaDeVentas = new FormData();
		fd_grpListaDeVentas.right = new FormAttachment(100, -42);
		fd_grpListaDeVentas.left = new FormAttachment(0, 10);
		fd_grpListaDeVentas.bottom = new FormAttachment(100, -10);
		fd_grpListaDeVentas.top = new FormAttachment(0, 343);
		grpListaDeVentas.setLayoutData(fd_grpListaDeVentas);
		grpListaDeVentas.setText("Lista de ventas");
		grpListaDeVentas.setLayout(new FormLayout());
		
		table = new Table(grpListaDeVentas, SWT.BORDER | SWT.FULL_SELECTION);
		FormData fd_table = new FormData();
		fd_table.bottom = new FormAttachment(100, -32);
		fd_table.left = new FormAttachment(0, 16);
		fd_table.right = new FormAttachment(0, 651);
		fd_table.top = new FormAttachment(0, 40);
		table.setLayoutData(fd_table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("New Column");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("New Column");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(100);
		tblclmnNewColumn_2.setText("New Column");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_3.setWidth(100);
		tblclmnNewColumn_3.setText("New Column");
		
		Group grpInformacionDeLa_1 = new Group(composite, SWT.NONE);
		grpInformacionDeLa_1.setText("Informacion de la venta");
		FormData fd_grpInformacionDeLa_1 = new FormData();
		fd_grpInformacionDeLa_1.bottom = new FormAttachment(grpListaDeVentas, -43);
		fd_grpInformacionDeLa_1.top = new FormAttachment(grpInformacionDeLa, 15);
		fd_grpInformacionDeLa_1.right = new FormAttachment(grpInformacionDeLa, 0, SWT.RIGHT);
		fd_grpInformacionDeLa_1.left = new FormAttachment(0, 10);
		grpInformacionDeLa_1.setLayoutData(fd_grpInformacionDeLa_1);
		
		Label lblNewLabel = new Label(grpInformacionDeLa_1, SWT.NONE);
		lblNewLabel.setBounds(10, 32, 55, 15);
		lblNewLabel.setText("New Label");
		
		text = new Text(grpInformacionDeLa_1, SWT.BORDER);
		text.setBounds(92, 32, 190, 21);
		
		Label lblCliente = new Label(grpInformacionDeLa_1, SWT.NONE);
		lblCliente.setBounds(472, 32, 37, 15);
		lblCliente.setText("Cliente");
		
		Combo combo_1 = new Combo(grpInformacionDeLa_1, SWT.NONE);
		combo_1.setItems(new String[] {"Juan", "Pedro"});
		combo_1.setBounds(530, 29, 108, 23);
		
		Button btnAgregarVenta = new Button(composite, SWT.NONE);
		btnAgregarVenta.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		FormData fd_btnAgregarVenta = new FormData();
		fd_btnAgregarVenta.top = new FormAttachment(grpInformacionDeLa_1, 6);
		fd_btnAgregarVenta.left = new FormAttachment(0, 307);
		btnAgregarVenta.setLayoutData(fd_btnAgregarVenta);
		btnAgregarVenta.setText("Realizar venta");

		return container;
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}


	/**
	 * Create the status line manager.
	 * @return the status line manager
	 */
	@Override
	protected StatusLineManager createStatusLineManager() {
		StatusLineManager statusLineManager = new StatusLineManager();
		return statusLineManager;
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			VentaView window = new VentaView();
			window.setBlockOnOpen(true);
			window.open();
			Display.getCurrent().dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Configure the shell.
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("New Application");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(773, 678);
	}
}
