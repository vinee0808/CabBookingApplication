import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from '../login/login.component';

import { CommonModule } from '@angular/common';

import { HomeComponent } from '../home/home.component';

import { DriverSignupComponent } from '../driver-signup/driver-signup.component';
import { CustSignupComponent } from '../cust-signup/cust-signup.component';
import { RegisterComponent } from '../register/register.component';
import { LogoutComponent } from '../logout/logout.component';

import { PastTripsComponent } from '../past-trips/past-trips.component';
import { AddPaymentComponent } from '../customer/add-payment/add-payment.component';
import { AddReportComponent } from '../customer/add-report/add-report.component';
import { BookCabComponent } from '../customer/book-cab/book-cab.component';
import { ShowPastTripsComponent } from '../customer/show-past-trips/show-past-trips.component';
import { ShowTripStatusComponent } from '../customer/show-trip-status/show-trip-status.component';

const routes: Routes = [
  {path:'', redirectTo:'/home', pathMatch:'full'},
  {path:'home', component:HomeComponent},
  {path:'login', component:LoginComponent},
  {path:"register", component:RegisterComponent},
  {path:"add-payment", component: AddPaymentComponent},
  {path:"add-report", component: AddReportComponent},
  {path:"book-cab", component: BookCabComponent},
  {path:"show-past-trips", component:ShowPastTripsComponent},
  {path:"show-trip-status", component: ShowTripStatusComponent},
  {path:"past-trips", component:PastTripsComponent},
  {path:"logout", component:LogoutComponent},
  {path:'driver', component:DriverSignupComponent},
  {path:'cust-signup', component:CustSignupComponent},
  {path:'driver-signup', component:DriverSignupComponent},
  {path:'**', redirectTo:'/home', pathMatch:'full'}
];

@NgModule({
  imports: [
    CommonModule, RouterModule.forRoot(routes)],
    declarations:[],
  exports: [RouterModule]
})
export class AppRoutingModule { }

