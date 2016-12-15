/**
 * Created by Kraft on 2016-12-15.
 */
public abstract class GameUtils implements GameModel {

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    protected void setGameboardState(GameTile[][] board, final Position pos, final GameTile tile) {
        setGameboardState(board, pos.getX(), pos.getY(), tile);
    }


    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    protected void setGameboardState(GameTile[][] board, final int x, final int y,
                                     final GameTile tile) {
        board[x][y] = tile;
    }

}
