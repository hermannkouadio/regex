/*
 * generated by Xtext 2.24.0
 */
package bdroussi.nkouadio.tl.tp2.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractWLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(bdroussi.nkouadio.tl.tp2.wL.WLPackage.eINSTANCE);
		return result;
	}
}