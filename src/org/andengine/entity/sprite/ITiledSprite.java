package org.andengine.entity.sprite;

import org.andengine.opengl.texture.region.ITiledTextureRegion;

public interface ITiledSprite extends ISprite{

	ITiledTextureRegion getTiledTextureRegion();

	int getCurrentTileIndex();

	void setCurrentTileIndex(int pCurrentTileIndex);

	int getTileCount();

}