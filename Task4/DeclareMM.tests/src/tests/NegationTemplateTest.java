/**
 */
package .tests;

import .Factory;
import .NegationTemplate;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Negation Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NegationTemplateTest extends ActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NegationTemplateTest.class);
	}

	/**
	 * Constructs a new Negation Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegationTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Negation Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NegationTemplate getFixture() {
		return (NegationTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Factory.eINSTANCE.createNegationTemplate());
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

} //NegationTemplateTest
