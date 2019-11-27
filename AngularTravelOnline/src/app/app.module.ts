import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';

import { RouterModule, Routes } from '@angular/router';

import { MatToolbarModule } from '@angular/material/toolbar';
import { MatCardModule } from '@angular/material/card';
import { MatExpansionModule } from '@angular/material/expansion';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatDialogModule } from '@angular/material/dialog';
import { FormsModule, ReactiveFormsModule, FormControl } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AuthenticationService } from './services/authentication.service';
import { RouterService } from './services/router.service';
import { LoginComponent } from './login/login.component';
import { TravelsummaryComponent } from './travelsummary/travelsummary.component';
import { CanActivateRouteGuard } from './can-activate-route.guard';
import { DashboardComponent } from './dashboard/dashboard.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatStepperModule } from '@angular/material/stepper';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { AuthorisedTopNavComponent } from './authorised-top-nav/authorised-top-nav.component';
import { AuthorisedSideNavTogglerComponent } from './authorised-side-nav-toggler/authorised-side-nav-toggler.component';
import { AuthorisedSideNavComponent } from './authorised-side-nav/authorised-side-nav.component';
import { PaymentsComponent } from './payments/payments.component';

const appRoutes: Routes = [
       { path: 'login', component: LoginComponent },
       {
         path: 'dashboard', component: DashboardComponent, canActivate: [CanActivateRouteGuard],
         children: [
                    {
                        path: 'view/summary',
                        component: TravelsummaryComponent
                    },
                    {
                        path: 'view/payments',
                        component: PaymentsComponent
                    },
                    {
                      path: '',
                      redirectTo: 'view/summary',
                      pathMatch: 'full'
                    }
                  ]
       },
       {
         path: '',
         redirectTo: 'login',
         pathMatch: 'full'
       },
       {
           path: '**',
           redirectTo: 'login',
           pathMatch: 'full'
         }
     ];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    TravelsummaryComponent,
    DashboardComponent,
    AuthorisedTopNavComponent,
    AuthorisedSideNavTogglerComponent,
    AuthorisedSideNavComponent,
    PaymentsComponent
  ],
  imports: [
    BrowserModule,
    BrowserModule,
    MatToolbarModule,
    MatCardModule,
    MatExpansionModule,
    MatFormFieldModule,
    MatInputModule,
    MatDialogModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    MatSelectModule,
    BrowserAnimationsModule,
    MatPaginatorModule,
    MatStepperModule,
    MatSidenavModule,
    MatListModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [AuthenticationService, RouterService, CanActivateRouteGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
