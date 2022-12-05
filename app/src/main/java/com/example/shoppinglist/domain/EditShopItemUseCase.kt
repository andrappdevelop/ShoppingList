package com.example.shoppinglist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopListItem(shopItem: ShopItem) {
        shopListRepository.editShopListItem(shopItem)
    }
}