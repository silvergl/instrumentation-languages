package kieker.develop.rl.typing.semantics

import kieker.develop.rl.typing.ITypeProvider
import org.eclipse.emf.ecore.resource.ResourceSet

class AnnotationProviderFactory {
	
	/**
	 * empty constructor.
	 */
	new () {}

	/**
	 * Create a new type provider or fetch the already created type provider for the primitive
	 * types.
	 *
	 * @param resourceSet
	 *            The resource set associated with the type provider
	 * @param repository
	 *            the application model
	 * @return Returns the type provider for primitive types.
	 */
	def synchronized static AnnotationProvider getTypeProvider(ResourceSet resourceSet) {
		if (resourceSet != null) {
			val object = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
					.get(AnnotationURIHelper.PROTOCOL)
			if (object != null) {
				if (!(object instanceof ITypeProvider)) {
					System.out.println("Provider for " + AnnotationURIHelper.PROTOCOL + " is " + object)
					// TODO something went terribly wrong, to be save create a new type provider
					return AnnotationProviderFactory.createTypeProvider(resourceSet)
				} else {
					return object as AnnotationProvider
				}
			} else {
				return AnnotationProviderFactory.createTypeProvider(resourceSet)
			}
		} else {
			throw new IllegalArgumentException("Cannot get type provide without a resourceSet.");
		}
	}

	/**
	 * Create a new type provider for primitive types and register it with the resource.
	 *
	 * @param resourceSet
	 *            The resource set associated with the type provider.
	 * @param repository
	 *            the application model
	 * @return Returns the new type provider.
	 */
	def private static AnnotationProvider createTypeProvider(ResourceSet resourceSet) {
		val typeProvider = new AnnotationProvider(resourceSet)
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
				.put(AnnotationURIHelper.PROTOCOL, typeProvider)
		return typeProvider
	}
}