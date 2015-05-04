# -*- coding: utf-8 -*-
"""
Created on Tue Apr 21 14:02:15 2015

@author: shrav
#"""
#import unittest
#
#class test():
#    
#    def setUp(self):
#        self.num = 1;
#        
#    def test_math(self):
#        self.assertEqual(self.num,1)
#        
#    def test_divide_by_zero(self):
#        self.assertEqual(ZeroDivisionError,lambda:1/0)
#        
#if __name__ == '__main__':
#     unittest.main()  

from __future__ import division
import math
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D
from matplotlib import cm
import numpy as np
import copy

def OneD(a,L,umin,umid,umax,N,dt,tmax):
    u = [[umin]]
    for i in range(1,N-1):
        u[0].append(umid)
    u[0].append(umax)
    dx = L/N
    t = dt
    while round(t,4) < tmax:
        u.append([umin])
        for i in range(1,N-1):
            u[-1].append(round(u[-2][i]+dt*a*(u[-2][i+1]-2*u[-2][i]+u[-2][i-1])/(dx*dx),5))
        u[-1].append(umax)
        t += dt
    return u

def P1(mode="a"):
    if mode=="a":
        fig = plt.figure()
        for N,p in [(8,221),(16,222),(32,223),(64,224)]:
            u = OneD(0.035,2.5,60,20,20,N,0.01,5)
            x = [i*2.5/N for i in range(N)]
            y = [j*0.01 for j in range(int(5/0.01))]
            X,Y = np.meshgrid(x,y)
            ax = fig.add_subplot(p, projection='3d')
            surf = ax.plot_surface(X,Y,u,rstride=1, cstride=1,linewidth=0, cmap=cm.coolwarm)
            ax.set_zlim(20,60.01)
            ax.set_xlabel('X Position (cm)')
            ax.set_ylabel('Time (s)')
            ax.set_zlabel('Temperature (C)')
            ax.set_title('N='+str(N))
            fig.colorbar(surf,ticks=[t for t in range(20,61,5)])
        plt.show()
    if mode == "b":
        fig = plt.figure()
        for t,p in [(0.001,221),(0.01,222),(0.1,223)]:
            u = OneD(0.035,2.5,60,20,20,32,t,5)
            x = [i*2.5/32 for i in range(32)]
            y = [j*t for j in range(int(5/t))]
            X,Y = np.meshgrid(x,y)
            ax = fig.add_subplot(p, projection='3d')
            surf = ax.plot_surface(X,Y,u,rstride=1, cstride=1,linewidth=0, cmap=cm.coolwarm)
            if t!=0.1:
                ax.set_zlim(20,60.01)
            ax.set_xlabel('X Position (cm)')
            ax.set_ylabel('Time (s)')
            ax.set_zlabel('Temperature (C)')
            ax.set_title('Timestep:'+str(t))
            if t != 0.1:
                fig.colorbar(surf,ticks=[t for t in range(20,61,5)])
        plt.show()

if __name__=="__main__":
    P1("a")
    P1("b")

























      
