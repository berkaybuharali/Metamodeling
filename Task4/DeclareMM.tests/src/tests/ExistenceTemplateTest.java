/**
 */
package .tests;

import .ExistenceTemplate;
import .Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Existence Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExistenceTemplateTest extends ActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExistenceTemplateTest.class);
	}

	/**
	 * Constructs a new Existence Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Existence Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExistenceTemplate getFixture() {
		return (ExistenceTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Factory.eINSTANCE.createExistenceTemplate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ExistenceTemplateTest
