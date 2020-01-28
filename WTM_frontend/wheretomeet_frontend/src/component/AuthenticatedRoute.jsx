import React, { Component } from 'react'
import { Route, Redirect } from 'react-router-dom'
import AuthenticationService from '../service/AuthenticationService';

export default function AuthenticatedRoute({ children, ...rest }) {
    console.log("authenticated route");
    return (
      <Route
        {...rest}
        render={({ location }) =>
            AuthenticationService.isUserLoggedIn() ? (
            children
          ) : (
            <Redirect
              to={{
                pathname: "/",
                state: { from: location }
              }}
            />
          )
        }
      />
    );
  }
