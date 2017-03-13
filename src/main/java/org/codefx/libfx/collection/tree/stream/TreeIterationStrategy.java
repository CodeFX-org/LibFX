package org.codefx.libfx.collection.tree.stream;

import java.util.Optional;

/**
 * A strategy of how to navigate through a tree (i.e. a connected, directed, acyclic graph).
 *
 * @param <E>
 *            the type of elements contained in the tree
 */
@FunctionalInterface
public interface TreeIterationStrategy<E> {

	/**
	 * @return the next node; {@link Optional#empty() empty} if no next node exists
	 */
	Optional<E> goToNextNode();

}
