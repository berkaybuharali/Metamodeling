/**
 */
package .tests;

import .ChoiceTemplate;
import .Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Choice Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChoiceTemplateTest extends ActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChoiceTemplateTest.class);
	}

	/**
	 * Constructs a new Choice Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Choice Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChoiceTemplate getFixture() {
		return (ChoiceTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Factory.eINSTANCE.createChoiceTemplate());
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

} //ChoiceTemplateTest
