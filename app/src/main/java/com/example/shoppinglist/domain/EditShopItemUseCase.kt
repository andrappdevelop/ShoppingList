package com.example.shoppinglist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun editShopListItem(shopItem: ShopItem) {
        shopListRepository.editShopListItem(shopItem)
    }
}