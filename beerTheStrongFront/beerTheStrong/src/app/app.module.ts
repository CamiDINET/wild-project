import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { NavBarComponent } from './componentsFixed/nav-bar/nav-bar.component';
import { HopPageComponent } from './pages/hop-page/hop-page.component';
import { MaltPageComponent } from './pages/malt-page/malt-page.component';
import { YeastPageComponent } from './pages/yeast-page/yeast-page.component';
import { RecipePageComponent } from './pages/recipe-page/recipe-page.component';
import { IngredientComponent } from './shared/ingredient/ingredient.component';
import { VariousPageComponent } from './pages/various-page/various-page.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    NavBarComponent,
    HopPageComponent,
    MaltPageComponent,
    YeastPageComponent,
    RecipePageComponent,
    IngredientComponent,
    VariousPageComponent
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
