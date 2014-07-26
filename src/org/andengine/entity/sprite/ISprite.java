package org.andengine.entity.sprite;

import org.andengine.entity.IEntity;
import org.andengine.entity.shape.IShape;
import org.andengine.opengl.texture.region.ITextureRegion;

public interface ISprite extends IShape, IEntity {

	ITextureRegion getTextureRegion();

	boolean isFlippedHorizontal();

	void setFlippedHorizontal(boolean pFlippedHorizontal);

	boolean isFlippedVertical();

	void setFlippedVertical(boolean pFlippedVertical);

	void setFlipped(boolean pFlippedHorizontal, boolean pFlippedVertical);

}