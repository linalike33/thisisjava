package com.mjc813.ch20.game;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IGameMybatis {
	void insertData(GameDto newGame);
}
