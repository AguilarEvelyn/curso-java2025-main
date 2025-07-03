package containers;
import java.util.Set;

import enums.ContainerType;
import products.IProduct;

public interface IContainer {

    // Getters

	String getReference();
	//int getResistance();
	ContainerType getType();
	Set<IProduct> getProducts();
    

    // Propiedades calculadas

    int calculateSurface();
	int calculateVolume();
    
    // Lógica de negocio
	int volumeAvailable();

	boolean canInsert(IProduct product);
	boolean isResistantTo(IProduct product);
}
